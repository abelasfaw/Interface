1.Go to folder containing code
	create two terminals one for client one for server
2.specify java jdk path(on both)
	code>> path="C:\Program Files\Java\jdk1.8.0_121\bin"
	
3.Compile all the .java files (from one terminal)
	code>> javac *.java
	or 
	code>> javac file1.java //for each file 
4.Generate skeletons and stubs (from same terminal in step 3)
	code>> rmic CalcuatorClass(class with method implementation)
5.Start registry (from same terminal in step 4)
	code>> start rmiregisry
6.Start Server(from same terminal in step 4)
	code>> java Server
7.Start Client (from other terminal)
	code>> java Client (from second terminal)
Out put of the addition will be displayed 