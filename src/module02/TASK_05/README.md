# Git opportunities for team development

> Question: What is git?
> 
> Answer: Git is a Version Control System (VCS). Unlike other version control systems, 
> git stores data as a series of snapshots of a miniature filesystem.

> Question: Git has three main states that your files can be in. List and explain.
>
> Answer: Git has three main states that your files can reside in: modified, staged, and committed:
> - Modified means that you have changed the file but have not committed it to your database yet.
> - Staged means that you have marked a modified file in its current version to go into your next commit snapshot.
> - Committed means that the data is safely stored in your local database.
>
> ![git states](images/areas.png)

> Question: What does the "git add" command do?
>
> Answer: "git add" command allows you to start tracking changes in the specified files.
    
> Question: What is the "git clone" command for?
>
> Answer: "git clone" command clone an existing repository.

> Question: What will "git status" seem to you?
>
> Answer: "git status" shows which branch we are on and what files are in what state.

> Question: What is ".gitignore" file for?
>
> Answer: ".gitignore" file specifies intentionally untracked files to ignore.

> Question: What do you think about "git diff"?
>
> Answer: "git diff" command show changes between the working tree and the index or a tree, 
> changes between the index and a tree, changes between two trees, changes resulting from a merge, 
> changes between two blob objects, or changes between two files on disk.

> Question: What is "git checkout"? How this command can be used?
>
> Answer: "git checkout" command switch branches or restore working tree files. 
> It updates files in the working tree to match the version in the index or the specified tree. 
> If no pathspec was given, git checkout will also update HEAD to set the specified branch as the current branch.

> Question: What is "git push"?
>
> Answer: "git push" command updates remote repository refs using local refs, 
> while sending objects necessary to complete the given refs.

> Question: What is "git pull"?
>
> Answer: "git pull" command fetch from and integrate with another repository, or a local branch.

> Question: What will "git branch" give you?
>
> Answer: "git branch" command list, create, or delete branches.

> Question: Okay, answer what "git merge" will give you and let's finish with that.
>
> Answer: "git merge" command join two or more development histories (branches) together.