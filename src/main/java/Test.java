import java.util.Scanner;
import org.apache.log4j.Logger;

public class Test {
    final static Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        Test test = new Test();
        test.logMethod("parameter");


        Scanner scan = new Scanner(System.in);
        Hobby footbal = new Hobby();
        System.out.println("FIRST");
        System.out.println("Enter mark of your first hobby skills");
        char markOfYourSkills = scan.next().charAt(0);
        test.logMethod("parameter");
        System.out.println("Enter frequensy of your classes");
        byte frequensyOfClasses = scan.nextByte();
        test.logMethod("parameter");
        System.out.println("Enter your experiense in this hobby(in year)");
        short experienceOfHobby = scan.nextShort();
        test.logMethod("parameter");
        System.out.println("Enter yor best result in your firs hobby");
        int yourBestResult = scan.nextInt();
        test.logMethod("parameter");
        System.out.println("Enter period when you start(year)");
        long periodOfStarting = scan.nextLong();
        test.logMethod("parameter");
        System.out.println("You do only this hobby(true or false)");
        boolean onlyThisHobby = scan.nextBoolean();
        test.logMethod("parameter");
        System.out.println("How much friends you founds with this hobby?");
        float friendsInHobby = scan.nextFloat();
        test.logMethod("parameter");
        System.out.println("Enter yor personal mark of your hobby skills");
        double markOfBenefit = scan.nextDouble();
        test.logMethod("parameter");

        footbal.setFrequensyOfClasses(frequensyOfClasses);
        footbal.setExperienceOfHobby(experienceOfHobby);
        footbal.setFriendsInHobby(friendsInHobby);
        footbal.setMarkOfBenefit(markOfBenefit);
        footbal.setMarkOfYourSkills(markOfYourSkills);
        footbal.setOnlyThisHobby(onlyThisHobby);
        footbal.setPeriodOfStarting(periodOfStarting);
        footbal.setYourBestResult(yourBestResult);
        System.out.println("SECOND");
        System.out.println("Enter yor personal mark of your second hobby skills");
        char markOfYourSkills1 = scan.next().charAt(0);
        test.logMethod("parameter");
        System.out.println("Enter frequensy of your second hobby classes");
        byte frequensyOfClasses1 = scan.nextByte();
        test.logMethod("parameter");
        Hobby basketball = new Hobby(frequensyOfClasses1, markOfYourSkills1);
        System.out.println("THIRD");
        System.out.println("You do only this hobby(true or false)");
        boolean onlyThisHobby3 = scan.nextBoolean();
        test.logMethod("parameter");
        System.out.println("How much friends you founds with this(third) hobby?");
        float friendsInHobby3 = scan.nextFloat();
        test.logMethod("parameter");
        System.out.println("Enter yor best result in your third hobby");
        int yourBestResult3 = scan.nextInt();
        test.logMethod("parameter");

        Hobby volleyball = new Hobby(onlyThisHobby3, friendsInHobby3, yourBestResult3);
        System.out.println("------------FIRST------------");
        footbal.tellAboutHobby();
        System.out.println("------------SECOND------------");
        basketball.tellAboutHobby();
        System.out.println("------------THIRD------------");
        volleyball.tellAboutHobby();
    }

    public void logMethod (String parameter) {
        if(logger.isDebugEnabled())
            logger.debug("Debug mode: " + parameter);

        if(logger.isInfoEnabled())
            logger.info("Info mode: " + parameter);

        logger.error("Error mode: " + parameter);
    }
}
