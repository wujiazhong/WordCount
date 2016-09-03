## WordCounter

WordCounter is a starter web development project that you can load in the RTC client for Eclipse. It uses Jazz Source Control Management (Jazz  SCM for short). Given some text, this application counts the number of words in the text. Click the WordCounter folder to explore the code stored in it.

You can play with an instance of the application running at http://wordcounter.mybluemix.net/

A. Setting up the application on your desktop
---

You can use the RTC client for Eclipse to load this project. The [Jazz SCM clients tutorial](https://hub.jazz.net/docs/reference/jazz_scm_client/) describes how to set up the RTC client for Eclipse, connect to this project and load the code.

Once the code is loaded in Eclipse, you need an application server to test it out locally. Go to the page [Download Liberty profile in Eclipse](https://developer.ibm.com/wasdev/downloads/liberty-profile-using-eclipse/). Steps 2 and 3 show how to install Liberty on Eclipse and to create a Liberty profile application server.


B. Running the application locally
---
Follow these directions to run the application on the Liberty server.

1. In the Project Explorer view, right-click the project.
2. From the pop-up menu, click Run As > Run on Server.
3. In the 'Run On Server' dialog, select the Liberty profile server and click Finish.

This will start the Liberty profile server and the application will get deployed to it. Upon successful deployment, the App should get launched in Eclipse itself. You can also use the URL http://localhost:8080/WordCounter and test it in a Web Browser.


C. Running JUnit test cases locally
---

The tests java resources should have the WordCounterFinderTest.java file in the com.ibm.ids.example.tests package.

1. Right-click the WordCounterFinderTest.java file.
2. In the pop-up, click Run As > JUnit Test. The JUnit view should open with the results. 

Now you can modify the Web application and test out the changes from the RTC client in Eclipse.

Authors: Prachi Khadke, Scott Rich
