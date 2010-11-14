package pc;

import java.util.List;

public interface Box {

	public String getName();
	
	public String getInstanceType();
	
	public List<? extends Field> getInputPorts();
	
	public List<? extends Field> getOutputPorts();	
	
}
