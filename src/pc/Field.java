package pc;

public interface Field {

	public String getName();
	
	public String getDataType();
	
	public int getPrecision();
	
	public int getScale();

    public String  getPortType();

	public void setName( String name );
	
	public void setDataType( String dataType );
	
	public void setPrecision( int precision );
	
	public void setScale( int scale );

    public void setPortType(String porttype);
}
