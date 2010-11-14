package constant;

public enum BoxType {
    SOURCE("SOURCE"),
	TARGET("TARGET"),
	TRANSFORMATION("TRANSFORMATION"),
	MAPPLET("MAPPLET");
    private String boxType;
    private BoxType(String boxType){
        this.boxType=boxType;
    }
    public String getBoxType(){
        return boxType;
    }
}
