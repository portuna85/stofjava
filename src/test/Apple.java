package test;

public class Apple {
    private final String company = "APPLE";     // 회사명
    private String modelName;                   // 모델명
    private String modelNo;                     // 모델번호
    private int serialNo;                       // 시리얼 넘버

    /*
    public Apple() {
        this.modelName = "Iphone";
        this.modelNo = "1525";
        this.serialNo = 214;
    }
    */

    public Apple() {
        this("Iphone", "1525", 214);
    }

    public Apple(String modelName, String modelNo, int serialNo) {
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.serialNo = serialNo;
    }

    public String getCompany() {
        return company;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void powerOn() {
        System.out.println("Apple 전원 켜기");
    }

    public void powerOff() {
        System.out.println("Apple 전원 종료");
    }

    public void sendiMessage() {
        System.out.println("Apple iMessage 발신");
    }

    public void reciveiMessage() {
        System.out.println("Apple iMessag 수신");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "company='" + company + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", serialNo=" + serialNo +
                '}';
    }
}