# RoC - A Romanian C based language

# Description
RoC is a C/C++/Java based programming language that has the goal to help out romanians people to:
  - code more effiecient, that's due to its romanian translated syntax
  - simplified syntax compared to C/C++, but is following the same concepts

The RoC can be immediatelly spotted by the file extension `<file name>.rc`, as a convention the filenames should have to same name as the class within the file i.e `MyClass.rc` would contain `MyClass` within the file. Unlike, Java RoC supports only one line comments represented by a hashtag and the language name `#RoC`.
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
| `++` (Increment) |	Increments the value of the variable by one | 	`a++` is 11 |
| `--` (Decrement) |	Decrements the value of the variable by one |	`a--` is 9 |

- Relational Operators
Define the kind of relationship between two entities and returns a bool value in case of RoC
In this example let's assume that a is 12 and b is 50. 

| Operator | Description | Example |
| -- | -- | -- |
| `>`  | 	greater than |	`a > b` is false |
| `<`  |	less than   |	`a < b` is true |
| `>=` |	greater than or equal to  | 	`a >= b` is true |
| `<=` |	less than or equal to | `a <= b` is true |
| `==` |	equal to | 	`a == b` is false |
| `!=` |	not equal |	`a != b` is true |

### Scope 
The scope in RoC is described by the curly brackets `{  }`.
- `{` represents the start of a new scope
- `}` represents the end of a scope 
Let's say take a scenario where we would like to have a new scope

# 1. Variables:

| Types | Value | Description |
| -- | -- | -- |
| numar | 10, -1, 0.25 | This type can be an integer, float, double or even a long if we compare RoC to other C based languages |
| sdc | "string" | Contains only strings |
| automat |  "string", 1, -12, 0.21, FALS/ADEVARAT, [10, "tuple"] | This type can decide what is the best type, and has a feature to hold tuples |
| bool | ADEVARAT/FALS | `ADEVARAT` is true and `FALS` is false but it's translated in Romanian | 

When assigning a value in RoC we do `numbar b <- 10;`, to break down `numar` keyword represents the variable type, `b` is the identifier of the variable and `<-` is the operator which says to assign value `10` to `b`. Therefore the mold for this would look like this `<variable type> <identifier> <- <value to assign>`

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

pentru numar I<-0 : <condition> : i++ executa { 

numar num<-0

num++

} 
```
# 3 Conditional Expressions

- If, else if and else statement:
```
daca (<condition>) { 

  I <- I++

} altfel daca (<condition>) { 

  I <- 2

} daca nu { 

I <- 3

} 
```

# 4 Methods 
The methods are following the C-like languages concepts. In RoC will be declared using the `functia` keyword followed by an identifier of the method optional will have parameters and the return type of the method. The scope of the method is provided by the curly brackets.  
```
functia foo (<params>) returneaza <type> { 

 <do stuff>

returneaza <return variable if wanted>

} 
```

- Example:
```
functia f(numar number) returneaza numar { 

returneaza number + 2 * 4

} 
```
# 5 Print statement
RoC has a special method that can be called to print statements in the console
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
      returneaza a<-a*2
    }

    $RoC This is a random comment
    $RoC I think it's cool 

    functia getNumberMultiplied(numar mult) returneaza numar
    {
      returneaza mult<-mult*2
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

