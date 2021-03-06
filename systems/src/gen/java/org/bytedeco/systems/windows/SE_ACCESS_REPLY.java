// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SE_ACCESS_REPLY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SE_ACCESS_REPLY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SE_ACCESS_REPLY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SE_ACCESS_REPLY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SE_ACCESS_REPLY position(long position) {
        return (SE_ACCESS_REPLY)super.position(position);
    }

    public native @Cast("DWORD") int Size(); public native SE_ACCESS_REPLY Size(int Size);
    public native @Cast("DWORD") int ResultListCount(); public native SE_ACCESS_REPLY ResultListCount(int ResultListCount);  // Indicate the array size of GrantedAccess and AccessStatus, it only can be either 1 or ObjectTypeListCount.
    public native @Cast("PACCESS_MASK") IntPointer GrantedAccess(); public native SE_ACCESS_REPLY GrantedAccess(IntPointer GrantedAccess);
    public native @Cast("PDWORD") IntPointer AccessStatus(); public native SE_ACCESS_REPLY AccessStatus(IntPointer AccessStatus);
    public native @Cast("PACCESS_REASONS") ACCESS_REASONS AccessReason(); public native SE_ACCESS_REPLY AccessReason(ACCESS_REASONS AccessReason);
    public native @Cast("PPRIVILEGE_SET*") PointerPointer Privileges(); public native SE_ACCESS_REPLY Privileges(PointerPointer Privileges);
}
