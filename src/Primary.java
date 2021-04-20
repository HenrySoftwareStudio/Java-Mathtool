




import errorhandler.Handle;
import languageResources.LangHandler;
import miscellaneous.InitClass;
import miscellaneous.Resource;

public class Primary
{
	public static void main(String[] args) throws Exception
	{
		LangHandler.Inuse_ErrorOutText=(String[]) LangHandler.langcontrol(Resource.LANGID_ENG, 6);
		Handle.INITError();
		try
		{
			
			InitClass.init();
			LangHandler.autosetup(Resource.LANGID_ENG);
		}
		catch (Throwable e) 
		{
			Handle.LogError(e);
		}
	}
}
