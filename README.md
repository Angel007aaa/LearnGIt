# concurrent_learn
用来学习git 初始化上传项目
echo "# concurrent_learn" >> README.md   //创建一个文件README.md 里面的内容为 concurrent_learn
git init   //初始化一个本地git仓库
git add README.md  //将README.md 添加到git仓库记录中
git commit -m "first commit" //将更改记录提交到本地暂存区  备注为first commit
git remote add origin https://github.com/xiaoxinglai/concurrent_learn.git  //关联远端仓库
git push -u origin master  //将本地仓库推送到远端仓库， 本地记录推送到远端的master分支上
aaa