package akshawop.tools;

public class Hash
{
  private StringBuffer hash;
  private int[] hashKey;
  
  public Hash(String pass) throws Exception
  {
    if(pass.length() == 0)
    {
      throw new Exception("Invalid input String...");
    }
    
    hash = new StringBuffer();
    encode(pass);
  }
  
  private boolean logic(int i)
  {
    return hashKey[i] / 69 == 0;
  }
  
  private void encode(String pass)
  {
    if(hash.length() != 0)
      return;
    
    hashKey = new int[pass.length()];
    for(int i = 0, len = pass.length(); i < len; i++)
    {
      char ch = pass.charAt(i);
      int rand = (int) (Math.random() * 101);
      
      hashKey[i] = rand;
      if(logic(i))
        rand *= -1;
        
      ch += rand;
      hash.append(ch);
    }
  }
  
  private StringBuffer decode()
  {
    StringBuffer og = new StringBuffer();
    
    for(int i = 0; i < hashKey.length; i++)
    {
      int rand = hashKey[i];
      
      if(!logic(i))
        rand *= -1;
        
      char ch = (char) (hash.charAt(i) + rand);
      og.append(ch);
    }
    return og;
  }
  
  public StringBuffer getHashCode()
  {
    return hash;
  }
  
  public StringBuffer getKey()
  {
    StringBuffer key = new StringBuffer();
    for(int value : hashKey)
      key.append(value);
      
    return key;
  }
  
  public boolean auth(String pass)
  {
    return decode().toString().equals(pass);
  }
}
