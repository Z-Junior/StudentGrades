/**
 * Student Grades Lab
 * @author Zhenyang Li
 * @since September 16 2017
 */

import org.jetbrains.annotations.Contract;

/**
 * @class StudentGrades
 * @classdesc Prints a table of student grades
 */
public class StudentGrades {
    public static void main(String[] Args)
    {
        StudentData DataSet[] = new StudentData[] {
                new StudentData("Joe", 5, 7),
                new StudentData("Sue", 90, 10),
                new StudentData("Ace", 0, 0),
                new StudentData("Amy", 50, 10),
                new StudentData("Ben", 70, 30)
        };

        PrintHeader();

        for (int i = 0; i < DataSet.length; i++)
        {
            PrintStudent(DataSet[i]);
        }
    }
    public static void PrintHeader()
    {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("== \t\t\tStudent Points \t\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n");
        System.out.println("Name \t\t Lab \t Bonus \t\t Total");
        System.out.println("---- \t\t --- \t ----- \t\t -----");
    }

    /**
     * Prints a row of student data
     * Uses ugly unallocated indentation
     * @param {StudentData} Student
     */
    public static void PrintStudent(StudentData Student)
    {
        System.out.println(Student.Name + "\t\t\t " + Student.Lab + "\t\t " + Student.Bonus + "\t\t\t " + (Student.Lab + Student.Bonus));
    }
}
