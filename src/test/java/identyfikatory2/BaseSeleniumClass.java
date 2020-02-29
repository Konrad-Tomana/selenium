package identyfikatory2;

import identyfikatory.BaseSeleniumClass;

class ClassInDiffPackage extends BaseSeleniumClass {

    public void checkAccessFromSubClass(){
        System.out.println(first);
        System.out.println(third);
    }
}
