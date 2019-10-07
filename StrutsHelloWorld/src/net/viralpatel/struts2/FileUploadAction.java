package net.viralpatel.struts2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.components.File;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletRequestAware {

			
	private File userImage;
	private String userContentType;
	private String userImageFileName;
	
	
	private HttpServletRequest servletRequest;
	
	public String execute() {
		try {
			String filePath =  servletRequest.getSession().getServletContext().getRealPath("/");
				System.out.println("Server path :"+ filePath);
				File fileToCreate =  new File(filePath, this.userImageFileName);
				
				FileUtils.copyFile(this.userImage, filePath);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
