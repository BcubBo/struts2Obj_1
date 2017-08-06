package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private File pic;
	private String picContentType;
	private String picFileName;
	Logger logger = (Logger)LogManager.getLogger();
	public String execute() {
		logger.debug("文件上传启动");
		String rootPath = ServletActionContext.getServletContext().getRealPath("/");
		//
		String newFileName = rootPath+"/uploads/"+picFileName;
		//
		System.out.println(newFileName);
		File destFile = new File(newFileName);
		
		
		try {
			FileUtils.copyFile(pic, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.addActionMessage("上传失败");
			return ERROR;
		}
		
		logger.debug("文件上传结束");
		this.addActionMessage("上传成功");
		return SUCCESS;
		
		
	}

	
	
	
	
	
	
	
	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
