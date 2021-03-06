// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /** Nodes are the backbone of the graph of Value dataflow. Every node has
     *  zero or more nodes as arguments and one value, which is either a tensor
     *  view or a (possibly empty) tuple of values. */
    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Node extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Node(Pointer p) { super(p); }
    
        public native void revalidate_and_infer_types();
        // Called after transition
        public native void delayed_validate_and_infer_types();

        /** The class name, must not contain spaces */
        public native @StdString BytePointer description();
        public native @StdString BytePointer get_friendly_name();
        public native @StdString BytePointer get_name();
        public native void set_name(@StdString BytePointer name);
        public native void set_name(@StdString String name);
        /** Return true if this has the same implementing class as node. This
         *  will be used by the pattern matcher when comparing a pattern
         *  graph against the graph. */
        public native @Cast("bool") boolean is_same_op_type(@Const @SharedPtr @ByRef Node node);

        public native void set_output_type(@Cast("size_t") long i,
                                     @Const @ByRef Type element_type,
                                     @Const @ByRef PartialShape pshape);

        public native @Cast("bool") boolean is_parameter();
        public native @Cast("bool") boolean is_output();
        public native @Cast("bool") boolean is_constant();
        public native @Cast("bool") boolean is_op();
        public native @Cast("bool") boolean is_commutative();
        public native @Cast("size_t") long get_instance_id();
        
        public native @Cast("std::ostream*") @ByRef Pointer write_short_description(@Cast("std::ostream*") @ByRef Pointer arg0);
        public native @Cast("std::ostream*") @ByRef Pointer write_long_description(@Cast("std::ostream*") @ByRef Pointer arg0);

        // TODO: Deprecate
        // TODO: Deprecate
        // Deprecated
        // TODO: Remove from unit tests.
        // Deprecated
        // TODO: Remove from unit tests.

        /** Get control dependencies registered on the node */

        public native void add_control_dependency(@SharedPtr @ByVal Node node);

        public native void remove_control_dependency(@SharedPtr @ByVal Node node);

        /** Returns the number of outputs on the for the node. */
        public native @Cast("size_t") long get_output_size();

        /** Returns the element type for output i */
        public native @Const @ByRef Type get_output_element_type(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its element type */
        public native @Const @ByRef Type get_element_type();

        /** Returns the shape for output i */
        public native @Const @ByRef Shape get_output_shape(@Cast("size_t") long i);

        /** Returns the partial shape for output i */
        public native @Const @ByRef PartialShape get_output_partial_shape(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its shape */
        public native @Const @ByRef Shape get_shape();

        /** Returns the tensor for output i */
        public native @ByRef DescriptorTensor get_output_tensor(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its tensor. */
        public native @ByRef DescriptorTensor get_output_tensor();

        /** Returns the tensor view of output i */
        public native @SharedPtr @ByVal DescriptorTensor get_output_tensor_ptr(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its tensor view. */
        public native @SharedPtr @ByVal DescriptorTensor get_output_tensor_ptr();

        /** Returns the set of inputs using output i */

        /** Returns the number of inputs for the op */
        public native @Cast("size_t") long get_input_size();

        /** Returns the element type of input i */
        public native @Const @ByRef Type get_input_element_type(@Cast("size_t") long i);

        /** Returns the shape of input i */
        public native @Const @ByRef Shape get_input_shape(@Cast("size_t") long i);

        /** Returns the partial shape of input i */
        public native @Const @ByRef PartialShape get_input_partial_shape(@Cast("size_t") long i);

        public native @ByVal NodeVector get_arguments();

        public native @SharedPtr @ByVal Node get_argument(@Cast("size_t") long index);

        public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);

        public native @ByVal NgraphFunctionVector get_functions();

        /** True if this and node have one output with same element type and shape */
        

        /** Get device placement */
        public native @Cast("ngraph::Placement") int get_placement();

        /** Set device placement */
        public native void set_placement(@Cast("ngraph::Placement") int placement);

        /** Get device placement */
        public native @Cast("size_t") long get_placement_index();

        /** Set device placement */
        public native void set_placement_index(@Cast("size_t") long placement);

        /** Get input descriptor that is connected to src */
        public native Input get_input_from(@Const @SharedPtr @ByRef Node src);

        /** Get ouput descriptor that outputs to dst */
        public native Output get_output_to(@Const @SharedPtr @ByRef Node dst);

        /** Get all the nodes that uses the current node */
        public native @ByVal NodeVector get_users(@Cast("bool") boolean check_is_used/*=false*/);
        public native @ByVal NodeVector get_users();

        public native @SharedPtr @ByVal Node get_default_value();
        /** Use instance ids for comparison instead of memory addresses to improve determinism */
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Node other);
        @MemberGetter public static native @Cast("const size_t") long placement_invalid();
        public static final long placement_invalid = placement_invalid();
    }
