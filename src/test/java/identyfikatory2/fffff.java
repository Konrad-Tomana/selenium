package identyfikatory2;

import identyfikatory.BaseSeleniumClass;

class ClassInDiffPackage2 {

    public void accessCheck() {
        BaseSeleniumClass baseClass = new BaseSeleniumClass();
        System.out.println(baseClass.first);
    }
}
