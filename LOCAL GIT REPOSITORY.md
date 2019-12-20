### LOCAL GIT REPOSITORY

***

### REMOTE GIT REPOSITORY(원격)

***



- WORKING DIRECTORY`(WD)`

  `=>` ADD(FILE)`=>`

  - INDEX
    - STAGING AREA

  `=>`COMMIT`=>`

  - COMMIT HISTORY



> `$ git init` **(master)**
>
> > branch가 생겼을 때 가장 큰 줄기, 디폴트 값으로 만들어지는 branch를 말함



> `$ git push origin master`
>
> > remote git repository에 push 하는 것.



**`gitignore`의 중요성**`*`

***

**`git status` `git log`** 

*작업할 때 항상 찍어보면서 하세용*

***



- 다른 장소에서 Github를 이용하기 위해서는 `pull`부터. 동기화부터!
- `git clone + "복사할 clone의 주소"`

- Merge Commit

  - > A와 B가 공동 작업자로 같은 파일 commit 작업 중 충돌이 일어나게 되면 선택지가 주어짐.
    >
    > > - Auto Merge
    > >
    > >   > 동일 파일이 아닌 다른 파일 2개가 수정, push 되었을 경우에는 
    > >   >
    > >   > 자동으로 파일이 수정, 합쳐지게 됨.
    > >   >
    > >   > 충돌이 일어나게 되는 경우는 같은 파일을 수정 중 일 때.



`git init` - 초기화



`$ git reset HEAD 01_git_reset/reset.txt`

`$ git rm --cached 01_git_reset/reset2.txt`

**두 방법의 차이를 알아두기.**



- `$ git commit --amend`

  > commit 명령어를 수정하고 싶을때.
  >
  > 'i' 끼워넣기 기능으로 수정!
  >
  > 나올 때는 ':wq' 



### Branch 생성 방법//Master과 Merge 하는 방법



$ git branch feature/test



$ git checkout feature/test
Switched to branch 'feature/test'



$ git checkout -b feature/test
Switched to a **new** branch 'feature/test'



$ git branch -D feature/test
Deleted branch feature/test (was 6e82934).



$ git merge feature/test
Updating 6e82934..d870245
Fast-forward
 02_git_branch/merge-test.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 02_git_branch/merge-test.txt



### 임시저장(stash)

- $ git stash
  Saved working directory and index state WIP on master: f1559f8 Hello World in java -> python



- $ git stash apply
  On branch master
  Changes to be committed:
    (use "git restore --staged <file>..." to unstage)
          new file:   03_git_stash/stash-test.txt



- $ git stash drop
  Dropped refs/stash@{0} (915aae2c99d0caa3abf5305f6c71ec9ddf5a1294



- $ git stash pop
  
  > `(apply와 drop을 동시에 하는 명령어)`
  
  On branch master
  Changes to be committed:
    (use "git restore --staged <file>..." to unstage)
          new file:   03_git_stash/stash-test.txt

Dropped refs/stash@{0} (956b34869d538c4f5d136cedb09c938db73cc08d)



- $ git log --pretty=oneline

>  해쉬코드 나옴



### RESET

- $ git reset --hard 01e9e133860bd68f7dc9a2224e512b8445500306

> 해당 커밋의 해쉬코드, 삭제

- - Working Directory까지 모두 수정됨



- $ git reset --soft 3d3613ac678176c139c1a0d2808f5733532423f0

>  해당 커밋의 해쉬코드, 삭제

- - Staging Area만 남겨두고



- $ git reset --mixed cb80467e2db8fb5e5fa86ada243170e65c3c1450

> 커밋이 되돌아가는데, Working Directory까지.. 
>
> 'mixed' 코드가 reset 디폴트  명령어



- $ git reset HEAD~2

> 해쉬코드 말고 HEAD의 위치를 기준으로 Reset, 
>
> (2단계 전으로 돌리겠다)
>
> Working Directory로 돌아가지는 않았지만(내용이 삭제되지는 않았지만) ADD가 되지 않은 상태로 돌아감



### REVERT

> RESET과 동시에 RESET이 되었다는 HISTORY가 남음

- =>`88d636c (HEAD -> master) Revert "added & updated test2.txt file"`
  - 이런식으로,,,,



### GITHUB 사용 수칙

1. master branch는 반드시 배포 가능한 상태여야 한다.
2. feature branch는 각 기능의 의도를 알 수 있게 한다.
3. commit message는 각 메세지의 의도와 내용을 정확하게 작성하도록 한다. 

456 더 있는데 못씀 ㅠ



1. 깃헙 퐄크

2. 포크된 레파지토리를 나의 로컬 컴퓨터로 클론 뜸

3. 내 컴퓨터의 오리진에 푸쉬

   $ git push origin master

4. git remote add upstream 레파지토리 주소



***

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git checkout -b feature/login
Switched to a new branch 'feature/login'

student@M1305 MINGW64 ~/github-fork-pull-request-flow (feature/login)
$ git add .

student@M1305 MINGW64 ~/github-fork-pull-request-flow (feature/login)
$ git commit -m "updated README.md file"
[feature/login c7f63fe] updated README.md file 
 1 file changed, 2 insertions(+), 1 deletion(-)

student@M1305 MINGW64 ~/github-fork-pull-request-flow (feature/login)
$ git push origin feature/login
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 342 bytes | 342.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
remote: 
remote: Create a pull request for 'feature/login' on GitHub by visiting:
remote:      https://github.com/nanayunn/github-fork-pull-request-flow/pull/new/feature/login    
remote:
To https://github.com/nanayunn/github-fork-pull-request-flow.git
 * [new branch]      feature/login -> feature/login

student@M1305 MINGW64 ~/github-fork-pull-request-flow (feature/login)
$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git branch -D feature/login
Deleted branch feature/login (was c7f63fe).

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git branch
* master

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git remote -v
origin  https://github.com/nanayunn/github-fork-pull-request-flow.git (fetch)
origin  https://github.com/nanayunn/github-fork-pull-request-flow.git (push)

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git remote add upstream https://github.com/kyhoon001/github-fork-pull-request-flow.git

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git remote -v
origin  https://github.com/nanayunn/github-fork-pull-request-flow.git (fetch)
origin  https://github.com/nanayunn/github-fork-pull-request-flow.git (push)
upstream        https://github.com/kyhoon001/github-fork-pull-request-flow.git (fetch)
upstream        https://github.com/kyhoon001/github-fork-pull-request-flow.git (push)

student@M1305 MINGW64 ~/github-fork-pull-request-flow (master)
$ git pull upstream master
remote: Enumerating objects: 1, done.
remote: Counting objects: 100% (1/1), done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (1/1), done.
From https://github.com/kyhoon001/github-fork-pull-request-flow
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> upstream/master
Updating 6e960b4..d2b182d
Fast-forward
 README.md | 3 ++-
 1 file changed, 2 insertions(+), 1 deletion(-)

***

