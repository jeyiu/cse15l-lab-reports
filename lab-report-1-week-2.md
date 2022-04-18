# Week 2 Lab Report (April 8th, 2022)
## Overview
> This is going to be a tutorial for incoming 15L students and my future self to log into course specific accounts like `ieng6`. 

**Steps:**
1) Installing VScode

2) Remotely Connecting

3) Trying Some Commands

4) Moving Files with scp

5) Setting an SSH Key

6) Optimizing Remote Running


## Installing VSCode
Install Visual Studio Code through the link below, and follow the instructed steps to install.

[Windows x64](https://code.visualstudio.com/docs/?dv=win)       [MacOS](https://code.visualstudio.com/docs/?dv=osx)       [Linux (.deb)](https://code.visualstudio.com/docs/?dv=linux64_deb)       [Linux (.rpm)](https://code.visualstudio.com/docs/?dv=linux64_rpm) 

For other options, check Visual Studio Code's [Official Website](https://visualstudio.microsoft.com/downloads/).

Once you finish installing, open the application. It should look like this. 

![VS Code](report-1-img-1.png)

## Remotely Connecting
Once you have installed VS Code, you can open a new terminal on VS Code using ctrl+shift+\` (Or use the built-in terminal/command prompt/powershell applications on your computer), and input the command below. 

```
ssh  <username>         //With the <username> replaced with your username.
``` 

Once you press enter, the terminal would prompt you for a password, to which you would input your account's password. 

The password would not show up on terminal as you are inputting it for confidentiality purposes, but don't worry you are typing. 

The terminal should response with something similar to this. 

![Remote Access](report-1-img-2.png)

If you see this screen, then congratulations, you have accessed the course account. 

## Trying Some Commands
Now that you are on the UNIX system in your course account, you can try out some of the UNIX specific commands!
Some commands that are available include:


* `cd ~`
* `cd`
* `ls -lat`
* `ls -a`
* `ls <directory\>`
* `cp <directory\>`
* `cat <directory\>`

Try them out to see what they do!

To use them, simply type them into the terminal. Example: 

![Running Command](report-1-img-3.png)

## Moving Files with scp
Now, we will learn how to move files from your local device to the course account. 

To do so, first you will need to navigate your terminal to the file you wish to transfer. (Don't forget to use `logout` to logout of the course account before doing so.)

You can navigate to the file by using the `cd` command we learned above. 

Once the terminal is at the directory the file is contained in, simply use the command below to begin transfer. 

```
scp <file-name> <account-name>:<directory>
```

For example, if I wanted to move the file "WhereAmI.java" on my computer to my course account cs15lsp22ajr@ieng6.ucsd.edu onto the account's default location, I would input: 
```
scp WhereAmI.java cs15lsp22ajr@ieng6.ucsd.edu:~/
```
Once the terminal returns the screen below, you have completed the transfer. Go check out the file by logging back in through ssh!

![Transfer Complete](report-1-img-4.png)

Try to do this with a file a few times to make sure you know how to do it. 
## Setting an SSH Key
After having to log in and out of ssh, aren't you tired of having to type your password over and over again? Well we could set up an SSH key on our local device to save the password. 

To use SSH Key, first you have to type in your terminal (when you're logged out of SSH):
```
ssh-keygen
```
Doing so would prompt the terminal to ask for a pathway to save the SSH key. You can use the default pathway by just pressing enter. 

Afterwards, the terminal would ask for a passcode. Remember, **DO NOT** set a passcode. Just press enter when the prompt asks for it. 

> If you are using windows, your command would be slighly different. Use `ssh-keygen -t ed25519` instead. 

Once you finish the steps above, use scp to transfer the SSH Key file to your course account using: 
```
scp /Users/<user-name>/.ssh/id_rsa.pub cs15lsp22zzz@ieng6.ucsd.edu:~/.ssh/authorized_keys
```
Of course, this is done with your username on your device and for course account. 

Once you run this line, it should prompt you for one last password, then that's it! (Your login should no longer require password input)

![no passowrd](report-1-img-5.png)

## Optimizing Remote Running
Now that you have learned all the skills necessary, let's learn some cheats that would make things easier. 

First, if you want ssh to run a command immediately after login, you can append it to the end of the login like this: 
```
ssh <username> "<command>"
```
You are also capable of stacking multiple commands using `;`. For instance, 
```
ssh cs15lsp22ajr@ieng6.ucsd.edu "javac WhereAmI.java;java WhereAmI"
```
would compile the WhereAmI.java file and run it. 

![short compile](report-1-img-6.png)

Doing so could help you make some of the tasks you need to complete easier. Especially if you need to repeatedly perform something. 
