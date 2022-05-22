# Week 8 Lab Report (May 21th, 2022)
## Overview
> This report is going to contain the documentation for the completion of testing based on the requirements of Lab Report 4. 

**Compoents**
1) Repository Links

2) Personal Repository Tests
    
    * Test 1
    * Test 2
    * Test 3

3) Given Repository Tests

    * Test 1
    * Test 2
    * Test 3

## Used Repositories
Personal repository used: [Link](https://github.com/jeyiu/markdown-parser)

Given repository used: [Link](https://github.com/JasonMorris1/markdown-parser)

### Personal Repository Tests
**Personal Repository Test 1**

Expected Output: ```["`google.com", "google.com", "ucsd.edu"]```

Test: 
![Snippet 1 test](report-4-img-4.png)

Output: 
![Snippet 1 out](report-4-img-1.png)

Since it outputted an AssertionError, we can tell that the test has failed. It was not supposed to retrieve url.com, yet it did, and it wasn't able to retrieve ucsd.edu. 

**Personal Repository Test 2**

Expected Output: ```["a.com", "a.com(())", "example.com"]```

Test: 
![Snippet 2 test](report-4-img-5.png)

Output: 
![Snippet 2 out](report-4-img-2.png)

Since it outputted an AssertionError, we can tell that the test has failed. It was unable to retrieve a.com(()) nor example.com. Hence, it has failed the test. 

**Personal Repository Test 3**

Expected Output: ```["https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"]```

Test: 
![Snippet 3 test](report-4-img-6.png)

Output: 
![Snippet 3 out](report-4-img-3.png)

Since it outputted an AssertionError, we can tell that the test has failed. It obtained links that were not written in markdown syntax, such as twitter.com. In addition, it also included the `\n` that wasn't supposed to be in the output. 