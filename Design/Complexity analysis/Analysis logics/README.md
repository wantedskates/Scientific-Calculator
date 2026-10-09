Until now i've thought about 2 ways to analyze a given algorithm , the tables way and the human imitating way. In the latter the program imitate the same way that a human does when they analyze an algorithm, so before implementing it , how does a human analyze the space and time complexity of an algorithm must be well-defined. 

## How does a human analyze code ? 

When a human opens a source file code that is written in one of the high level languages he typically follows this procedure :- 
1. Do not take any regard to comments
2. Break the code into blocks and those blocks into more blocks
3. Assign for each block a time and space complexity
4. Get the largest time and space complexity from all the blocks and this is the answer

This is a very general and abstract plan and i wonder how should my program even identify different blocks ? Code is a collection of statements and each statement is a block itself, a statement might be no more than 20 characters but a lot of complex logic might be happening in it , hence, we find that we must get to a lower layer of abstraction and see how does statements run behind the hood. 


## What are the topics i must study ? 
To do this one must understand the Theory of Compilers , i.e, when a compiler is given a code in some language, how does it translate to the target language and much more questions rise in my head right now. 

There is a lot of logic that will be done in the Complexity analyzer put i wont be coding all of it , my logic will be wrappaed around the state-of-the-art already established compilers, i.e., my program will collaborate with the established compiler, for example a big part of syntax checking won't be manually coded by me but rather the established compiler shall do it, but the (Tables)[https://github.com/wantedskates/Scientific-Calculator/blob/main/Design/Complexity%20analysis/Analysis%20logics/tablesLogic.md] method shall be coded by me, i hope you get the idea. 
