
public class Hobby {

    byte frequensyOfClasses;
    short experienceOfHobby;
    int yourBestResult;
    long periodOfStarting;
    char markOfYourSkills;
    boolean onlyThisHobby;
    float friendsInHobby;
    double markOfBenefit;

    public byte getFrequensyOfClasses() {
        return frequensyOfClasses;
    }

    public void setFrequensyOfClasses(byte frequensyOfClasses) {
        this.frequensyOfClasses = frequensyOfClasses;
    }

    public int getYourBestResult() {
        return yourBestResult;
    }

    public void setYourBestResult(int yourBestResult) {
        this.yourBestResult = yourBestResult;
    }

    public char getMarkOfYourSkills() {
        return markOfYourSkills;
    }

    public void setMarkOfYourSkills(char markOfYourSkills) {
        this.markOfYourSkills = markOfYourSkills;
    }

    public short getExperienceOfHobby() {
        return experienceOfHobby;
    }

    public void setExperienceOfHobby(short experienceOfHobby) {
        this.experienceOfHobby = experienceOfHobby;
    }

    public long getPeriodOfStarting() {
        return periodOfStarting;
    }

    public void setPeriodOfStarting(long periodOfStarting) {
        this.periodOfStarting = periodOfStarting;
    }

    public boolean isOnlyThisHobby() {
        return onlyThisHobby;
    }

    public void setOnlyThisHobby(boolean onlyThisHobby) {
        this.onlyThisHobby = onlyThisHobby;
    }

    public float getFriendsInHobby() {
        return friendsInHobby;
    }

    public void setFriendsInHobby(float friendsInHobby) {
        this.friendsInHobby = friendsInHobby;
    }

    public double getMarkOfBenefit() {
        return markOfBenefit;
    }

    public void setMarkOfBenefit(double markOfBenefit) {
        this.markOfBenefit = markOfBenefit;
    }

    public Hobby() {

    }

    public Hobby(byte frequensyOfClasses, char markOfYourSkills) {
        this.frequensyOfClasses = frequensyOfClasses;
        this.markOfYourSkills = markOfYourSkills;
    }

    public Hobby(boolean onlyThisHobby, float friendsInHobby, int yourBestResult) {
        this.onlyThisHobby = onlyThisHobby;
        this.friendsInHobby = friendsInHobby;
        this.yourBestResult = yourBestResult;
    }

    public void tellAboutHobby() {
        System.out.println("Frequensy of classes: " + frequensyOfClasses);
        System.out.println("Experience of hobby: " + experienceOfHobby);
        System.out.println("Your best result in this hobby:" + yourBestResult);
        System.out.println("Period of starting: " + periodOfStarting);
        System.out.println("Mark of your skills: " + markOfYourSkills);
        System.out.println("You doing only this hobby? " + onlyThisHobby);
        System.out.println("How much friends you find in this hobby? " + friendsInHobby);
        System.out.println("Mark of benefit for you: " + markOfBenefit);
    }

}

