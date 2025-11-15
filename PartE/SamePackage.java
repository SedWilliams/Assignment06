/****************************************************************************************
 * @File: SamePackage.java
 * @author: Shedrick Williams
 * @since: 11-14-2025
 * 
 * Description: Class that is in the same package as Main.java for Part E
 * This class does not need to be imported to be used in Main.java (PartE)
****************************************************************************************/

package PartE;

//accessible from package PartE unless imported into another package
public class SamePackage {

    public void printMessage() {
        System.out.println("Hello from the same package!");
    }
}
