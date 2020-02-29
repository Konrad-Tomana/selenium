/*
<select>
    <option value="volvo">Volvo</option>
    <option value="saab">Saab</option>
    <option value="mercedes">Mercedes</option>
    <option value="audi">Audi</option>
</select>
 */

public class Select {



    public void selectBy(String visibleText) {
        System.out.println("Wybieram wartość zawierającą tekst " + visibleText);
    }

    public void selectBy(int index) {
        System.out.println("Wybieram wartość z indexem " + index);
    }
}
