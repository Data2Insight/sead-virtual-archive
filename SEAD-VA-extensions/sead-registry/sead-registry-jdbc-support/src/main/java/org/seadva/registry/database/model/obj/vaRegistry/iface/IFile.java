package org.seadva.registry.database.model.obj.vaRegistry.iface;
import java.util.Set;
import javax.persistence.Basic;
import org.seadva.registry.database.model.obj.vaRegistry.Format;
import org.seadva.registry.database.model.obj.vaRegistry.iface.IBaseEntity;


/** 
 * Object interface mapping for hibernate-handled table: file.
 * @author autogenerated
 */

public interface IFile extends IBaseEntity {



    /**
     * Return the value associated with the column: fileName.
	 * @return A String object (this.fileName)
	 */
	String getFileName();
	

  
    /**  
     * Set the value related to the column: fileName.
	 * @param fileName the fileName value you wish to set
	 */
	void setFileName(final String fileName);

    /**
     * Return the value associated with the column: format.
	 * @return A Set&lt;Format&gt; object (this.format)
	 */
	Set<Format> getFormats();
	
	/**
	 * Adds a bi-directional link of type Format to the formats set.
	 * @param format item to add
	 */
	void addFormat(Format format);

  
    /**  
     * Set the value related to the column: format.
	 * @param format the format value you wish to set
	 */
	void setFormats(final Set<Format> format);

    /**
     * Return the value associated with the column: isObsolete.
	 * @return A Integer object (this.isObsolete)
	 */
	Integer getIsObsolete();
	

  
    /**  
     * Set the value related to the column: isObsolete.
	 * @param isObsolete the isObsolete value you wish to set
	 */
	void setIsObsolete(final Integer isObsolete);

    /**
     * Return the value associated with the column: sizeBytes.
	 * @return A Long object (this.sizeBytes)
	 */
	Long getSizeBytes();
	

  
    /**  
     * Set the value related to the column: sizeBytes.
	 * @param sizeBytes the sizeBytes value you wish to set
	 */
	void setSizeBytes(final Long sizeBytes);

    /**
     * Return the value associated with the column: versionNum.
	 * @return A String object (this.versionNum)
	 */
	String getVersionNum();
	

  
    /**  
     * Set the value related to the column: versionNum.
	 * @param versionNum the versionNum value you wish to set
	 */
	void setVersionNum(final String versionNum);

	// end of interface
}