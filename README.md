# Overview

topWords ported to Scala

# Objectives

An understanding of

 - how to port a Java project to Scala
 - Syntactic differences
 
 
# Extra Credit Oppotunities:
- 0.5 Add an command-line argument for updating the word cloud only every k steps. 4th arg
- 0.5 Treat words case-insensitively, i.e., ignore capitalization and the like.
- 1 Add an command-line argument for a minimum frequency to include a word in the word cloud. 5th arg
- 1 Read from a file an "ignore list" of words to be ignored regardless of length.
  The ignore list can be found in src/ignore_list.txt Feel free to edit it at your leasure. Words are ignored case-insensitively.
- Any words that are ignored from the text file do not effect the internal buffer.


# Running the applications

Note to grader: in order to run with command args, please use
sbt "run arg1 arg2 arg3 arg 4 arg5" < file input
or 
sbt "run arg1 arg2 arg3 arg 4 arg5"

with as many args as you wish.



    
    



