# RoC - A Romanian C based language

# Description
RoC is a C/C++/Java based programming language that has the goal to help out romanians people to:
  - code more efficient, that's due to its romanian translated syntax
  - simplified syntax compared to C/C++, but is following the same concepts

The RoC can be immediately spotted by the file extension `<file name>.rc`, as a convention the filenames should have to same name as the class within the file e.g. `MyClass.rc` would contain `MyClass` within the file. Unlike, Java RoC supports only one line comments represented by a hashtag, and the language name `#RoC`.
## Keywords dictionary 
This table contains all the translations of the keywords used in RoC from Romanian to English.

| Romanian | English |
| -- | -- |
| cat timp | while |
| pentru | for |
| executa | execute |
| functia | function/method |
| numar | number/integer |
| daca | if |
| altfel daca | else if |
| daca nu | else |
| printeaza | print |
| returneaza | return |
| adevarat | true |
| fals | false |

## Operators
- Arithmetic Operators
Assume that a is 10 and b is 1

| Operator | Description | Example |
| -- | -- | -- |
| `-` (Subtraction) | 	returns the difference of the values |	`a - b` is 9 |
| `*` (Multiplication) |	returns the product of the values  |	`a * b` is 10 |
| `/` (Division) |	performs division operation and returns the quotient  | 	`a / b` is 10 |
| `%` (Modulus)  |	performs division operation and returns the remainder | 	`a % b` is 0 |

- Relational Operators
Define the kind of relationship between two entities and returns a bool value in case of RoC
In this example let's assume that a is 12 and b is 50. 

| Operator | Description | Example |
| -- | -- | -- |
| `>`  | 	greater than |	`a > b` is false |
| `<`  |	less than   |	`a < b` is true |
| `>=` |	greater than or equal to  | 	`a >= b` is true |
| `<=` |	less than or equal to | `a <= b` is true |
| `=`  |	equal to | 	`a = b` is false |
| `!=` |	not equal |	`a != b` is true |

### Scope 
The scope in RoC is described by the curly brackets `{  }`.
- `{` represents the start of a new scope
- `}` represents the end of a scope 
- At this moment all the functions in RoC are static therefore when we create a new function the index starts from `0`.

# 1. Variables:

| Types | Value | Description |
| -- | -- | -- |
| numar | 10, -1, 0.25 | This type can be an integer, double if we compare RoC to other C based languages |
| sdc | "string" | Contains only strings |
| automat |  "string", 1, -12, 0.21, FALS/ADEVARAT | This type can decide what is the best type |
| bool | ADEVARAT/FALS | `ADEVARAT` is true and `FALS` is false but it's translated in Romanian | 

When assigning a value in RoC we do `numar b <- 10;`, to break down `numar` keyword represents the variable type, `b` is the identifier of the variable and `<-` is the operator which says to assign value `10` to `b`. Therefore the mold for this would look like this `<variable type> <identifier> <- <value to assign>`. 
- _Note*:_ When declaring a new variable you have to assign a new value to it! You can't do `numar a` for declaration.

# 2 Loops

- While loop:
```
cat timp <condition> executa { 

    <do stuff>

} 
```

- Do while loop:
```
executa { 

    <do stuff>

} cat timp <condition>  
```

- For loop:
```
numar num <- 0

pentru numar I<-0 : <condition> : I<-I+1 executa { 

numar num<-0

num++

}
```
- _Note*:_ The foor loop is present into the grammar, but we have decided to not implemente it for now.  

# 3 Conditional Expressions

- If, else if and else statement:
```
daca (<condition>) { 

  I <- I<-I+1

} altfel daca (<condition>) { 

  I <- 2

} daca nu { 

I <- 3

} 
```

# 4 Methods 
The methods are following the C-like languages concepts. In RoC will be declared using the `functia` keyword followed by an identifier of the method optional will have parameters and the return type of the method. The scope of the method is provided by the curly brackets. 
- _Note*:_ to return `void` you don't have to specify something simply ommit this `returneaza <type>`. And also if you want to return something you have to declare a variable and then return the identifier. You won't be able to do return statements like this `returneaza ADEVARAT`, `returneaza 23+2`, `returneaza "string"`.

```
functia foo(<params>) returneaza <type> { 

 <do stuff>

returneaza <return variable>

} 
```

- Example:
```
functia f(numar number) returneaza numar { 

numar a<-number + 2 * 4;
returneaza a 

} 
```
# 5 Print statement
- RoC has a special method that can be called to print statements in the console.
- Within the print statement we have decided to not accept expressions, therefore you will be able to print variables and types. 

```
printeaza(<stuff to print>)
```

# Program examples 

## 1
```
functia main()
{
    numar a<-12
    cat timp(ADEVARAT) executa
    {
        printeaza(getNumberMultiplied(a))
        printeaza(12)
    }

    functia getNumber() returneaza numar
    {
      numar a <-a*2
      returneaza a 
    }

    #RoC This is a random comment
    #RoC I think it's cool 

    functia getNumberMultiplied(numar mult) returneaza numar
    {
      numar mult<-mult*2
      returneaza mult 
    }
}
```

## 2 

```
functia main()
{
  bool myBooleanValue<-FALS

  for numar i<-1:myBooleanValue==FALS && i<:i<-i+1 executa
  {
    printeaza(i)
  }
}
```

# Bug list

- Our compiler has a major issue at this point when trying to nest more decission statements that the labels are not properly generated. 
- Suppose that we have the following code:
```
functia main()
{
printeaza("Leap Year Calculator")
scanner s <- scanner;
printeaza("Enter the year you want to check")

numar year <- s.urmatorul
bool leap <- FALS
    daca(year % 4 = 0)
    {
        daca(year % 100 = 0)
        {
            leap <- FALS
        }
        altfel daca
        {
            leap <- ADEVARAT
        }
    }
    altfel daca
    {
        leap <-FALS
    }
}
```
- Here is a snippet(only the if statements ) with the bytecode generated:
```
; daca(year % 4 = 0)
iload 1
ldc 4
irem
ldc 0
if_icmpne L2
; daca(year % 100 = 0)
iload 1
ldc 100
irem
ldc 0
if_icmpne L3
ldc 0
istore 2
goto endif
; altfel daca
L3:
ldc 1
istore 2
endif:
L3:
goto endif
; altfel daca
L3: ; this one should have been L2 
ldc 0
istore 2
endif:
L3:
```
- The issue with the code above is that the last else statement has the `L3` as label instead of `L2`. Which is going to cause a jasError error while compiling the bytecode file.
