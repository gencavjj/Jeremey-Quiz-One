# Jeremey-Quiz-One

### As a user, I should begin at a menu.
  - The menu will offer two choices, *create a character* and *view catch phrases*.
    - I should be able to select one of these options and execute the following processess respectfully:

### As a user, I should be able to create a character.
  - The user should be able to enter a character's name as input.
    - Each character will be created as a string and added to an array of characters.
  - The user should be able to enter any number of catch phrases for a character.
    - The user will be prompted to create a catch phrase for the character.
      - If the user adds a catch phrase, it will be created as a string and added to an array.
      - If the user does not add a catch phrase, go back to the main menu.
    
### As a user, I should be able to view a character's catch phrases.
  - The user should be able to enter a character's name as input.
    - If the character does not exist, display a message stating that it does not exist.
    - If the character does exist but has no catch phrases, display a message stating that it has no catch phrases.
    - If the character does exist and has catch phrases, display each catch phrase on a new line.
    
    
# Steps to pull down project

*Open the terminal and navigate to your directory of choice (for example, a `projects' directory under your user account folder)*

- Create a folder to hold your projects if you haven't already.
  - `mkdir projects`
  
- Navigate to the new folder.
  - `cd projects`
  
*Open github and go to the repository page*

- Find the green `Clone or download` button located at the top right of the menu on the main page. Copy that link.

*Go back to the terminal*

- Run `git clone { link to repository here }` and you will have the project.

- Run `ls` to see if the project folder was created (this will list all non hidden files and folders in a directory)

- Navigate into the project
  - `cd { created-folder-for-project }`
  
- Configure the remote branch
  - `git remote add origin { link to repository here }`
  
- Check out a branch in git to work off of 
  - `git checkout -B { branch name here (you can just use 'dev') for your branch name }`
  
# Steps to work on project

*Open terminal*

- While on your new branch, you can save your work with the following commands:
  - `git add .` - adds all changes in the staging index
  - `git commit -m "put commit message here"` - saves changes

# Steps to submit project

*From in terminal*

- Run the following command to push your program up to github AFTER CHANGES ARE COMMITTED:
  - `git push origin {branch - name}`
  
*From github*

- Submit a pull request to my master branch  (follow tutorial on how)
