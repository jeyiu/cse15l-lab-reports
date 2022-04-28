# Week 4 Lab Report (April 22th, 2022)
## Overview
> This is going to be a bug report for the program MarkdownParse that records three bugs and their fixes. 

**Compoents**
1) Bug #1: Infinite Loop

2) Bug #2: Incorrect Output

3) Bug #3: Incorrect Tester

## Bug #1: Infinite Loop
The file that caused the bug: [File](https://github.com/jeyiu/markdown-parser/blob/main/test-file-4.md)

The Symptom of the Bug: 
![Symptom 1](report-2-img-2.png)

Changes that fixed the bug: 
![Code Diff 1](report-2-img-1.png)

Before the fix, the program would return to index -1 and restart the search if it couldn't find any bracket/parenthesis, and continue to loop. 

The fix for this bug was through adding a line that breaks out of the program whenever it couldn't find any more bracket/parenthesis. 

## Bug #2: Incorrect Output
The file that caused the bug: [File](https://github.com/jeyiu/markdown-parser/blob/main/test-file5.md)

The Symptom of the Bug: 
![Symptom 2](report-2-img-4.png)

Changes that fixed the bug: 
![Code Diff 2](report-2-img-3.png)

Before the fix, the program would return `page.com` as one of the links even thought here is something between the end bracket and the open parenthesis. This shouldn't happen because in the syntax of markdown, that doesn't form a hypoerlink.  

The fix for this bug was through adding a line that tests if the space between `closeBracket` and `openParen` is 1. It would only add the link into the result if that is the case. 

## Bug #3: Index Out of Bound Error
The file that caused the bug: [File](https://github.com/jeyiu/markdown-parser/blob/main/test-file4.md)

The Symptom of the Bug: 
![Symptom 2](report-2-img-6.png)

Changes that fixed the bug: 
![Code Diff 2](report-2-img-5.png)

Before the fix, the program would reach out-of-bound indexes because it would continue to look for the closing bracket when it couldn't find one. This would occue whenever there is a bracket or parenthesis that isn't closed off in the file. 

The fix for this bug was through adding if statements that checks for all four components ([, ], (, )) exist, otherwise it would skip this and move-on to the next hyperlink. 