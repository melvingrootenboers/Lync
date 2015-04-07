// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class UserRole
{
	private final IMendixObject userRoleMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "System.UserRole";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModelGUID("ModelGUID"),
		Name("Name"),
		Description("Description"),
		grantableRoles("System.grantableRoles");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public UserRole(IContext context)
	{
		this(context, Core.instantiate(context, "System.UserRole"));
	}

	protected UserRole(IContext context, IMendixObject userRoleMendixObject)
	{
		if (userRoleMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("System.UserRole", userRoleMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a System.UserRole");

		this.userRoleMendixObject = userRoleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new UserRole(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static system.proxies.UserRole create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "System.UserRole");
		return new system.proxies.UserRole(context, mendixObject);
	}

	/**
	 * @deprecated Use 'UserRole.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.UserRole initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return system.proxies.UserRole.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.UserRole initialize(IContext context, IMendixObject mendixObject)
	{
		return new system.proxies.UserRole(context, mendixObject);
	}

	public static system.proxies.UserRole load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return system.proxies.UserRole.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.UserRole> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<system.proxies.UserRole> result = new java.util.ArrayList<system.proxies.UserRole>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//System.UserRole" + xpathConstraint))
			result.add(system.proxies.UserRole.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ModelGUID
	 */
	public final String getModelGUID()
	{
		return getModelGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelGUID
	 */
	public final String getModelGUID(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ModelGUID.toString());
	}

	/**
	 * Set value of ModelGUID
	 * @param modelguid
	 */
	public final void setModelGUID(String modelguid)
	{
		setModelGUID(getContext(), modelguid);
	}

	/**
	 * Set value of ModelGUID
	 * @param context
	 * @param modelguid
	 */
	public final void setModelGUID(IContext context, String modelguid)
	{
		getMendixObject().setValue(context, MemberNames.ModelGUID.toString(), modelguid);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final String getDescription(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(IContext context, String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of grantableRoles
	 */
	public final java.util.List<system.proxies.UserRole> getgrantableRoles() throws CoreException
	{
		return getgrantableRoles(getContext());
	}

	/**
	 * @param context
	 * @return value of grantableRoles
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.UserRole> getgrantableRoles(IContext context) throws CoreException
	{
		java.util.List<system.proxies.UserRole> result = new java.util.ArrayList<system.proxies.UserRole>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.grantableRoles.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(system.proxies.UserRole.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of grantableRoles
	 * @param grantableroles
	 */
	public final void setgrantableRoles(java.util.List<system.proxies.UserRole> grantableroles)
	{
		setgrantableRoles(getContext(), grantableroles);
	}

	/**
	 * Set value of grantableRoles
	 * @param context
	 * @param grantableroles
	 */
	public final void setgrantableRoles(IContext context, java.util.List<system.proxies.UserRole> grantableroles)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (system.proxies.UserRole proxyObject : grantableroles)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.grantableRoles.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return userRoleMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.UserRole that = (system.proxies.UserRole) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "System.UserRole";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
