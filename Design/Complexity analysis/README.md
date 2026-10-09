

# High abstract logic overview :- 


## 1. What is the user using ? 
Android or IOS or Windows or MacOs?

```
if (Windows or MacOs)
{ 1. Check if the User have an installed compiler or not?
if (compiler exist ) {
use it }

else if (compiler does not exist){
prompt the user to either download a one or to compile online}}

else if (Android or IOS){
do not trouble the user with installing a compiler , the app will just handle every thing locally , i.e., a very user
friendly mobile app}
```

## 2. After the code is received , in the semantics checking step , check wether the program is logically valid for complexity analysis or not?
```
if (not valid)
{tell the user this program is not valid for complexity analysis }
else if (valid){
do complexity analysis}
```

## 3. How to do the complexity analysis?

### Questions i am researching :-
 1. How to represent the size of the input and output data ?
 2. Should i bother to know the type of the input and output data ?
 3. I need a way to analyze to relationship between the inputs and outputs , how to do it? Should i just run the program a hundred times with
    growing input data and record the output data and then put them all in a table and then compare this table to the already established tables
    of the standard mathematical functions ( O(n) , O(n^2) , O(log n) ) and then find the table that most look like the program table and assign
    that complexity to it ? call this "[Tables way](https://github.com/wantedskates/Complexity-analyzer/tree/main/Design)" . I feel that there is a much more elegant way but right now let me stick with this one.
4. How to measure the different kinds of complexity analysis ? 


## 4. Error management 
This is basically the semantics checking step. If the user input a code that is [invalid for complexity analysis](https://github.com/wantedskates/Complexity-analyzer/blob/main/Design/error-management.md) , tell him why is that , 
do not just tell him it is not valid for analysis and to do so one must categorize the types of errors and to do so one must categorize 
the types of code given. 
### Questions i am researching. :-
1. What are the types of code that are invalid for complexity analysis ?
   
    



