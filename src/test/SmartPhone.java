package test;

public class SmartPhone extends Apple {
    private String phoneName;

    public SmartPhone() {
        /*
        super();
        */
    }

    public SmartPhone(String phoneName) {
        /*
        super();
        */
        this.phoneName = phoneName;
    }

    public SmartPhone(String modelName, String modelNo, int serialNo, String phoneName) {
        super(modelName, modelNo, serialNo);
        this.phoneName = phoneName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void endCall() {
        System.out.println("스마트폰 전화 종료");
    }

    public void sendCall() {
        System.out.println("스마트폰 전화 발신");
    }

    public void reciveCall() {
        System.out.println("스마트폰 전화 수신");
    }

    public void sendiMessage() {
        System.out.println("스마트폰 iMessage 발신");
    }

    public void reciveiMessage() {
        System.out.println("스마트폰 iMessage 수신");
    }
}