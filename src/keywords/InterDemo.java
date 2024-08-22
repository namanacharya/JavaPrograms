package keywords;
/*
 * class     ------> class     => extends keyword will be used
 * class     ------> interface => implements keyword will be used
 * interface ------> interface => extends keyword will be used 
 */
interface interDemo2
{
	int i2=12;
}
public interface InterDemo extends interDemo2
{
	int i1=45;
	public void show();
}
