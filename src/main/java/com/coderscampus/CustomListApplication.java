package com.coderscampus;

public class CustomListApplication {

  /**
   * This follows a convention used by some coders to avoid `static hell`.
   * 
   * To avoid confusing students with a static method that can only call static methods, 
   * this class only instantiates the App.java class and, then launches it.
   * 
   * Therefore, this class should not be modified. Modify App.launch() instead.
  */
	
  public static void main(String[] args){
	  CustomList<String> myCustomList = new CustomArrayList<>();
    new CustomList().launch();
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    myCustomList.add("element 1");
    for (int i=0; i<myCustomList.getSize(); i++) {
    	System.out.println(myCustomList.get(i));
    }
    
  }
}
