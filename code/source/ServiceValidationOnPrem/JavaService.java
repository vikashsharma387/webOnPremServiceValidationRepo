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

