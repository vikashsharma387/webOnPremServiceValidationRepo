package ServiceValidationOnPrem;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.File;
// --- <<IS-END-IMPORTS>> ---

public final class JavaService

{
	// ---( internal utility methods )---

	final static JavaService _instance = new JavaService();

	static JavaService _newInstance() { return new JavaService(); }

	static JavaService _cast(Object o) { return (JavaService)o; }

	// ---( server methods )---




	public static final void ConcatStrings (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(ConcatStrings)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string1
		// [i] field:0:required string2
		// [o] field:0:required response
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	string1 = IDataUtil.getString( pipelineCursor, "string1" );
			String	string2 = IDataUtil.getString( pipelineCursor, "string2" );
		pipelineCursor.destroy();
		
		String response = string1.concat(string2);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "response", response);
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void SampleJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(SampleJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required filename
		// [o] object:0:required templateFile
		IDataCursor pc = pipeline.getCursor();
		String filename = IDataUtil.getString(pc,"filename");
		File templateFile = new File(filename);
		//Service.doInvoke("pub.flow","debugLog" templateFile);
		if (templateFile.exists()) {
		   IDataUtil.put(pc, "templateFile", templateFile);
		}
		// --- <<IS-END>> ---

                
	}
}

