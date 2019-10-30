package com.ciczan.learnkotlin.classes

//Simplest class possible
class Empty

//Classes are public and final by default.
//This wont compile: class EmptySon : Empty

//For the class to be extensible we need to br explicit
open class OpenEmpty

//...notice the need for the primary constructor
class EmptySon : OpenEmpty()

//Class "opennes" is not inherited.
//Wont compile: class EmptyGrandson : EmptySon()




