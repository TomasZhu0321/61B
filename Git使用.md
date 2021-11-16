## A. Intro to Version Control Systems

1. 特点：
   * keep track of changes to files over time
   * allows to view or revert back to previous iterations of files =>allows users to reference older versions of their work and share code changes with others

###  Git

1. 特点：
   * Distributed version control system=>every developer's computer stores the entire history (including all old versions) of the entire project
2. **Repository**: entire history (including all old versions) of the entire project
   * stored locally leads to our ability to use Git locally on our own computers, even without Internet connection

***

## B. Local Repositories (Narrative Introduction)

### 1. Command in Terminal

* `cd ` : change directory
* `mkdir` : Make Directory (make a new folder)
* `code` : 因为安装的visual studio code，打开visual studio code文本编辑器编辑
* `cd ..` : return to the last folder

### 2. Git 

* `git init` : Create an empty Git repository or reinitialize an existing

* `git add .` : Add file contents to the index

* ` git status` : Show the working tree status

  

<img src="/Users/tomas/Desktop/61B/截屏2021-10-31 下午12.42.05.png" alt="截屏2021-10-31 下午12.42.05" style="zoom:33%;" />

* `git commit -m "xxxx"` : Record changes to the repository
  * **More explanation** : when executed, the commit command stores a snapshot of all added files into the repository
  * The **-m command** lets us add a message to the commit, so we can remember what was most important about this commit. 
  * **Common convention** : use imperative form rather than past tense
  * **Metaphor**: *As another analogy, you can think of the whole process like taking a panoramic picture on a camera. The ==add== command captures one portion of the image, and the ==commit== command stitches all “added” items together into a single panorama and throws this panorama into a safe. And just as a panorama only includes things you point at (not the entire 360 degree circle around you), the commit command only ensafes those files which have been added using the add command (and not all files in the recipes directory).*

* `git log` : Show the evidence of snapshot, the giant string of characters xxxxxx is the **ID** of the commit.
* `git show` : peek inside of this commit (rarely use it)

* `git checkout` : *Think of the checkout command as a robot that goes to our safe, figures out what the tofu recipe looked like back when the newest panorama was 9f955d85359fc8e4504d7220f13fad34f8f2c62b, and finally rearranges everything in the actual recipes/tofu folder so that it is exactly like it was at the time snapshot 9f955d85359fc8e4504d7220f13fad34f8f2c62b was created.*
  * *The checkout command does not change the commit history! Or in other words, the safe containing our panoramic photos is entirely unaffected by the checkout command. The entire point of git is to create a log of everything that has EVER happened to our files. In other words, if you took a panoramic photo of your room in 2014 and in 2015 and put them in a safe, then decided in 2016 to put it exactly back like it was in 2014, you would not set the panoramic photo from the year 2015 on fire. Nor would you a picture of it in 2016 magically appear inside your safe. If you wanted to record what it looked like in 2016, you’d need to take another photo (with the appropriate -m message to remember what you just did).*

* `git reset `: This will take the file’s status back to modified, leaving changes intact. Don’t worry about this command undoing any work. This command is the equivalent of deleting one of the temporary images that you’re going to combine into a panorama.*Why might we need to use this command? Let’s say you accidentally started tracking a file that you didn’t want to track. (an embarrassing video of yourself, for instance.) Or you were made some changes to a file that you thought you would commit but no longer want to commit quite yet.*

* `git commit --amend`:new amended commit will replace the previous commit.

  

![截屏2021-10-31 下午1.20.08](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-10-31 下午1.20.08.png)

***

## C. Local Repositories (Technical Overview)

* Tips:

  * If you commit, you can always revert your code or change it. However, if you don’t commit, you won’t be able to get old versions back. So commit often!

    

