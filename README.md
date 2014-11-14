scala-js-gh-pages-generator
===========================

Template project to demonstrate scala.js gh-pages generator.

To know more about github project pages see this link : https://help.github.com/articles/creating-project-pages-manually/



***Demo*** :

http://chandu0101.github.io/scala-js-gh-pages-generator/

![AppDemo](/images/app.png?raw=true)


***Usage*** :

 -> Commit All Your changes to master branch

 -> Specify your directory structure in deployment.json

 -> Install Jq (json processor - http://stedolan.github.io/jq/) on your machine

 -> If you're on mac and homebrew installed , type following command

 ```
  brew install jq
 ```

 -> Make deploy.sh executable

   ```
   chmod a+x deploy.sh
   ```

 -> Run it by supplying comment(optional)


   ```
   ./deploy.sh "first commit"
   ```

 -> That`s its , now your project is live on github pages

 ```
 http(s)://<username>.github.io/<projectname>
```