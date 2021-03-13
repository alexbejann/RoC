#Todo
- ~~Add fourth variable type~~ 
- Decide whether to allow separate initialization or declaration
- Add operators and describe how are they gonna work 
- Do we want this a=b=c -> a=(b=c)? In RoC would be a<-b<-c -> a<-(b<-c). If not, make an assignment a statement and not an expression 
- Specify block statements
- Specify global and local scope 
- Should we keep `functia` keyword in our language?

# RoC - A Romanian C based language

# Description
RoC is a C/C++/Java based programming language that has the goal to help out romanians people to:
  - code more effiecient, that's due to its romanian translated syntax
  - simplified syntax compared to C/C++, but is following the same concepts

The RoC can be immediatelly spotted by the file extension `<file name>.rc`, as a convention the filenames should have to same name as the class within the file i.e `MyClass.rc` would contain `MyClass` within the file. Unlike, Java RoC supports only one line comments represented by a hashtag and the language name `#RoC`.

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

# 2 Operators:

When assigning a value in RoC we do `numbar b <- 10;`, to break down `numar` keyword represents the variable type, `b` is the identifier of the variable and `<-` is the operator which says to assign value `10` to `b`. Therefore the mold for this would look like this `<variable type> <identifier> <- <value to assign>`

# 3 Loops

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
# 4 Conditional Expressions

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

# 5 Methods 
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
# 6 Print statement
RoC has a special method that can be called to print statements in the console
```
printeaza(<stuff to print>)
```

