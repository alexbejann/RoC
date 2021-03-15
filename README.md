# Todo

- ~~Add fourth variable type~~ 
- Decide whether to allow separate initialization or declaration
- ~~Add operators and describe how are they gonna work~~ 
- Do we want this a=b=c -> a=(b=c)? In RoC would be a<-b<-c -> a<-(b<-c). If not, make an assignment a statement and not an expression 
- ~~Specify block statements~~
- Specify global and local scope 
- ~~Should we keep `functia` keyword in our language?~~ `Yes, we will keep the keyword`

# TODO grammar:

-	~~Probably just a typo, but a very dangerous one: 'functia ' contains a space! this means the space is part of the token.~~
-	~~The rule method declaration can be written more concise by making ' 'returneaza' argument' optional, i.e. '('returneaza' argument)?'. What you have written is not wrong, but duplicate code is not good programming practice.~~
-	The 'statement' rule is clearly work in progress, but well on its way. You have elaborated the if-else statement and the print statement. You have a good idea what the statements should look like given the description, sothe ext step is to make ANTLR rules for them. So the assignment, loops, function calls etc.
-	~~I'm a bit uncertain about the role of 'expression' in the rule 'statement_body'. Does an expression without assignment make a valid line in your grammar, and what are its semantics? Like I said, C-like languages are expression-oriented meaning that an expression can be a statement. You may or may not want to do this. Depends on whether you make an assignment an expression or a statement. The rule 'statement_body' definitely needs rework, depending on what an expression means in your language.~~
-	~~In rule 'variable_declaration' can be written simpler by collapsing the three types in one symbol. Then you have only one rule. You even have a symbol for it: 'argument' (which should be called type). I think I know why you expanded it in three rules, so that you can assign a label to each rule. Understandable, because you haven't had type checking yet. But just use one symbol, and do the type checking in Java code.~~
-	~~In the 'expression' rule, a type is not an expression. Rather, it is part of a variable and function declaration.~~
- Implement the `auto` keyword with the tuples in the grammar
- Fix the expression for Relational operators 
- ~~Fix print statement~~


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
numar num <- 0;

pentru numar I<-0 : <condition> : i++ executa { 

numar num<-0; 

num++; 

} 
```
# 3 Conditional Expressions

- If, else if and else statement:
```
daca (<condition>) { 

  I <- I++; 

} altfel daca (<condition>) { 

  I <- 2;	 

} daca nu { 

I <- 3; 

} 
```

# 4 Methods 
The methods are following the C-like languages concepts. In RoC will be declared using the `functia` keyword followed by an identifier of the method optional will have parameters and the return type of the method. The scope of the method is provided by the curly brackets.  
```
functia foo (<params>) returneaza <type> { 

 <do stuff>

returneaza <return variable if wanted>; 

} 
```

- Example:
```
functia f(numar number) returneaza numar { 

returneaza number + 2 * 4; 

} 
```
# 5 Print statement
RoC has a special method that can be called to print statements in the console
```
printeaza(<stuff to print>)
```

