**Essentials**
---
1. Clone Mater branch : git clone -b master <clone-url>
2. Add all file and push to remote : git add -A 
3. Check file status : git status
4. Commit changes to local : git commit -m "commit message"
5. Push master to remote : git push origin master
6. Create a dev branch : git checkout -b develop
7. Push dev to remote : git push origin develop
8. Check branch: git branch -a 
9. Pull remote changes of an existing local branch : git pull origin <remote-branch> (fetch + merge)
10. Fetch remote changes of an existing local branch : git fetch origin <remote-branch> 
11. Reset the local changes commited that are not in upstream to that from upstream  : git pull -rebase
12. Set an Upstream for develop : git push --set-upstream origin develop 
    (msg: Branch 'develop' set up to track remote branch 'develop' from 'origin')
    (from now to push to remote just do 'git push')
13. Origin - <Remote Name>, develop/master - <Branch Name>
14. Add + Commit + Push at once : git commit -am "Message" && git push
14. Add file to .gitignore : echo <file-to-ignore> >> .gitignore (eg: echo .settings/ >> .gitignore)

**Fetch vs Pull vs Checkout**
--
Fetch : Will pulldown remote branch + create local copy of remote branch
Pull : fetch + merge
Checkout : will checkout a local copy of remote + do a merge 


 
