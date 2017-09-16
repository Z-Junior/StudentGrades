/**
 * Student Grades Lab
 * @author Zhenyang Li
 * @since September 16 2017
 */

/**
 * @class StudentData
 * @classdesc Stores student data for retrieval
 */
public class StudentData
{
    /**
     * All the possible student data, public to make them accessible with property but with no validations
     */
    public String Name;
    public int Lab;
    public int Bonus;

    /**
     * Initialize a StudentData object
     * @param n {Buffer} Student Name
     * @param l {Integer} Student Lab Grade
     * @param b {Integer} Student Bonus Grade
     */
    public StudentData(String n, int l, int b)
    {
        this.Name = n;
        this.Lab = l;
        this.Bonus = b;
    }
}
