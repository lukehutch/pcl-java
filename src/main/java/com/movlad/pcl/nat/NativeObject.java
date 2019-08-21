package com.movlad.pcl.nat;

/**
 * Bridge between a Java object and a native pointer.
 * 
 * @author Vlad-Adrian Moglan
 */
public abstract class NativeObject {

	@SuppressWarnings("unused")
	private volatile long handle;

	/**
	 * Associates a native pointer allocated on the native side to this object, if
	 * no such association exists.
	 */
	protected NativeObject() {
		alloc();
	}

	// /**
	// * @return the memory address given by the native pointer associated to this
	// * object if such an association exists, 0 otherwise.
	// */
	// public long getHandle() {
	// return handle;
	// }

	/**
	 * Associates a native pointer allocated on the native side to this object.
	 */
	protected abstract void alloc();

	/**
	 * Deallocates the memory given to the created object. Called automatically upon
	 * object destruction, but this may cause unexpected behavior: this should be
	 * called manually when the object is no longer needed.
	 */
	protected abstract void dispose();
}
