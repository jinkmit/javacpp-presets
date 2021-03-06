// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.global;

import org.bytedeco.tensorrt.nvinfer.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nvinfer extends org.bytedeco.tensorrt.presets.nvinfer {
    static { Loader.load(); }

// Parsed from NvInfer.h

/*
 * Copyright 1993-2018 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #ifndef NV_INFER_H
// #define NV_INFER_H

// #include <cstddef>
// #include <cstdint>

/** TensorRT major version. */
public static final int NV_TENSORRT_MAJOR = 5;
/** TensorRT minor version. */
public static final int NV_TENSORRT_MINOR = 0;
/** TensorRT patch version. */
public static final int NV_TENSORRT_PATCH = 0;
/** TensorRT build number. */
public static final int NV_TENSORRT_BUILD = 10;

/** Shared object library major version number. */
public static final int NV_TENSORRT_SONAME_MAJOR = 5;
/** Shared object library minor version number. */
public static final int NV_TENSORRT_SONAME_MINOR = 0;
/** Shared object library patch version number. */
public static final int NV_TENSORRT_SONAME_PATCH = 0;

// #if __cplusplus > 201103L
// #define _TENSORRT_FINAL final
// #else


/** Defines which symbols are exported */
// #define _TENSORRT_FINAL
// #endif
// #ifdef TENSORRT_BUILD_LIB
// #define TENSORRTAPI __attribute__((visibility("default")))
// #else


//!
//!
//!
//!

//!
//!
//!
// #define TENSORRTAPI
// Targeting ../nvinfer/cublasContext.java


// Targeting ../nvinfer/cudnnContext.java


// Targeting ../nvinfer/CUstream_st.java


// Targeting ../nvinfer/CUevent_st.java





//!
//!
//!
@MemberGetter public static native int NV_TENSORRT_VERSION();
public static final int NV_TENSORRT_VERSION = NV_TENSORRT_VERSION(); // major, minor, patch

/**
 *  \namespace nvinfer1
 * 
 *  \brief The TensorRT API version 1 namespace.
 *  */



/**
 *  \enum DataType
 *  \brief The type of weights and tensors.
 *  */
@Namespace("nvinfer1") public enum DataType {
    /** FP32 format. */
    kFLOAT(0),
    /** FP16 format. */
    kHALF(1),
    /** quantized INT8 format. */
    kINT8(2),
    /** INT32 format. */
    kINT32(3);

    public final int value;
    private DataType(int v) { this.value = v; }
    private DataType(DataType e) { this.value = e.value; }
    public DataType intern() { for (DataType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}



/**
 *  \enum DeviceType
 *  \brief The device that this layer/network will execute on.
 * 
 *  */
@Namespace("nvinfer1") public enum DeviceType {
    /** GPU Device */
    kGPU(0),
    kDLA(1),
    /** DLA core 0 */
    kDLA0(kDLA),
    /** DLA Core 1 */
    kDLA1(kDLA.value + 1);

    public final int value;
    private DeviceType(int v) { this.value = v; }
    private DeviceType(DeviceType e) { this.value = e.value; }
    public DeviceType intern() { for (DeviceType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


/**
 *  \enum DimensionType
 *  \brief The type of data encoded across this dimension.
 *  */
@Namespace("nvinfer1") public enum DimensionType {
    /** Elements correspond to different spatial data. */
    kSPATIAL(0),
    /** Elements correspond to different channels. */
    kCHANNEL(1),
    /** Elements correspond to different batch index. */
    kINDEX(2),
    /** Elements correspond to different sequence values. */
    kSEQUENCE(3);

    public final int value;
    private DimensionType(int v) { this.value = v; }
    private DimensionType(DimensionType e) { this.value = e.value; }
    public DimensionType intern() { for (DimensionType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/Dims.java


// Targeting ../nvinfer/Dims2.java


// Targeting ../nvinfer/DimsHW.java


// Targeting ../nvinfer/Dims3.java


// Targeting ../nvinfer/DimsCHW.java


// Targeting ../nvinfer/Dims4.java


// Targeting ../nvinfer/DimsNCHW.java


// Targeting ../nvinfer/Weights.java


// Targeting ../nvinfer/IHostMemory.java



/**
 *  \enum LayerType
 * 
 *  \brief The type values of layer classes.
 * 
 *  @see ILayer::getType()
 *  */
@Namespace("nvinfer1") public enum LayerType {
    /** Convolution layer. */
    kCONVOLUTION(0),
    /** Fully connected layer. */
    kFULLY_CONNECTED(1),
    /** Activation layer. */
    kACTIVATION(2),
    /** Pooling layer. */
    kPOOLING(3),
    /** LRN layer. */
    kLRN(4),
    /** Scale Layer. */
    kSCALE(5),
    /** SoftMax layer. */
    kSOFTMAX(6),
    /** Deconvolution layer. */
    kDECONVOLUTION(7),
    /** Concatenation layer. */
    kCONCATENATION(8),
    /** Elementwise layer. */
    kELEMENTWISE(9),
    /** Plugin layer. */
    kPLUGIN(10),
    /** RNN Layer. */
    kRNN(11),
    /** UnaryOp Operation Layer. */
    kUNARY(12),
    /** Padding Layer. */
    kPADDING(13),
    /** Shuffle Layer. */
    kSHUFFLE(14),
    /** Reduce layer. */
    kREDUCE(15),
    /** TopK Layer. */
    kTOPK(16),
    /** Gather Layer. */
    kGATHER(17),
    /** Matrix Multiply Layer. */
    kMATRIX_MULTIPLY(18),
    /** Ragged softmax Layer. */
    kRAGGED_SOFTMAX(19),
    /** Constant Layer. */
    kCONSTANT(20),
    /** RNNv2 layer. */
    kRNN_V2(21),
    /** Identity layer. */
    kIDENTITY(22);

    public final int value;
    private LayerType(int v) { this.value = v; }
    private LayerType(LayerType e) { this.value = e.value; }
    public LayerType intern() { for (LayerType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}



/**
 *  \enum TensorLocation
 *  \brief The location for tensor data storage, device or host.
 *  */
@Namespace("nvinfer1") public enum TensorLocation {
    /** Data stored on device. */
    kDEVICE(0),
    /** Data stored on host. */
    kHOST(1);

    public final int value;
    private TensorLocation(int v) { this.value = v; }
    private TensorLocation(TensorLocation e) { this.value = e.value; }
    public TensorLocation intern() { for (TensorLocation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/ITensor.java


// Targeting ../nvinfer/ILayer.java


// Targeting ../nvinfer/IConvolutionLayer.java


// Targeting ../nvinfer/IFullyConnectedLayer.java



/**
 *  \enum ActivationType
 * 
 *  \brief Enumerates the types of activation to perform in an activation layer.
 *  */
@Namespace("nvinfer1") public enum ActivationType {
    /** Rectified linear activation. */
    kRELU(0),
    /** Sigmoid activation. */
    kSIGMOID(1),
    /** TanH activation. */
    kTANH(2);

    public final int value;
    private ActivationType(int v) { this.value = v; }
    private ActivationType(ActivationType e) { this.value = e.value; }
    public ActivationType intern() { for (ActivationType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IActivationLayer.java



/**
 *  \enum PoolingType
 * 
 *  \brief The type of pooling to perform in a pooling layer.
 *  */
@Namespace("nvinfer1") public enum PoolingType {
    kMAX(0),              // Maximum over elements
    kAVERAGE(1),          // Average over elements. If the tensor is padded, the count includes the padding
    kMAX_AVERAGE_BLEND(2);// Blending between the max pooling and average pooling: (1-blendFactor)*maxPool + blendFactor*avgPool

    public final int value;
    private PoolingType(int v) { this.value = v; }
    private PoolingType(PoolingType e) { this.value = e.value; }
    public PoolingType intern() { for (PoolingType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IPoolingLayer.java


// Targeting ../nvinfer/ILRNLayer.java



/**
 *  \brief Controls how scale is applied in a Scale layer.
 * 
 *  @see IScaleLayer
 *  */
@Namespace("nvinfer1") public enum ScaleMode {
    /** Identical coefficients across all elements of the tensor. */
    kUNIFORM(0),
    /** Per-channel coefficients. The channel dimension is assumed to be the third to last dimension */
    kCHANNEL(1),
    /** Elementwise coefficients. */
    kELEMENTWISE(2);

    public final int value;
    private ScaleMode(int v) { this.value = v; }
    private ScaleMode(ScaleMode e) { this.value = e.value; }
    public ScaleMode intern() { for (ScaleMode e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IScaleLayer.java


// Targeting ../nvinfer/ISoftMaxLayer.java


// Targeting ../nvinfer/IConcatenationLayer.java


// Targeting ../nvinfer/IDeconvolutionLayer.java



/**
 *  \enum ElementWiseOperation
 * 
 *  \brief Enumerates the binary operations that may be performed by an ElementWise layer.
 * 
 *  @see IElementWiseLayer
 *  */
@Namespace("nvinfer1") public enum ElementWiseOperation {
    /** Sum of the two elements. */
    kSUM(0),
    /** Product of the two elements. */
    kPROD(1),
    /** Maximum of the two elements. */
    kMAX(2),
    /** Minimum of the two elements. */
    kMIN(3),
    /** Substract the second element from the first. */
    kSUB(4),
    /** Divide the first element by the second. */
    kDIV(5),
    /** The first element to the power of the second element. */
    kPOW(6);

    public final int value;
    private ElementWiseOperation(int v) { this.value = v; }
    private ElementWiseOperation(ElementWiseOperation e) { this.value = e.value; }
    public ElementWiseOperation intern() { for (ElementWiseOperation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IElementWiseLayer.java


// Targeting ../nvinfer/IGatherLayer.java



/**
 *  \enum RNNOperation
 * 
 *  \brief Enumerates the RNN operations that may be performed by an RNN layer.
 * 
 *  __Equation definitions__
 * 
 *  In the equations below, we use the following naming convention:
 * 
 *  ~~~
 *  t := current time step
 * 
 *  i := input gate
 *  o := output gate
 *  f := forget gate
 *  z := update gate
 *  r := reset gate
 *  c := cell gate
 *  h := hidden gate
 * 
 *  g[t] denotes the output of gate g at timestep t, e.g.
 *  f[t] is the output of the forget gate f.
 * 
 *  X[t] := input tensor for timestep t
 *  C[t] := cell state for timestep t
 *  H[t] := hidden state for timestep t
 * 
 *  W[g] := W (input) parameter weight matrix for gate g
 *  R[g] := U (recurrent) parameter weight matrix for gate g
 *  Wb[g] := W (input) parameter bias vector for gate g
 *  Rb[g] := U (recurrent) parameter bias vector for gate g
 * 
 *  Unless otherwise specified, all operations apply pointwise
 *  to elements of each operand tensor.
 * 
 *  ReLU(X) := max(X, 0)
 *  tanh(X) := hyperbolic tangent of X
 *  sigmoid(X) := 1 / (1 + exp(-X))
 *  exp(X) := e^X
 * 
 *  A.B denotes matrix multiplication of A and B.
 *  A*B denotes pointwise multiplication of A and B.
 *  ~~~
 * 
 *  __Equations__
 * 
 *  Depending on the value of RNNOperation chosen, each sub-layer of the RNN
 *  layer will perform one of the following operations:
 * 
 *  ~~~
 *  ::kRELU
 * 
 *    H[t] := ReLU(W[i].X[t] + R[i].H[t-1] + Wb[i] + Rb[i])
 * 
 *  ::kTANH
 * 
 *    H[t] := tanh(W[i].X[t] + R[i].H[t-1] + Wb[i] + Rb[i])
 * 
 *  ::kLSTM
 * 
 *    i[t] := sigmoid(W[i].X[t] + R[i].H[t-1] + Wb[i] + Rb[i])
 *    f[t] := sigmoid(W[f].X[t] + R[f].H[t-1] + Wb[f] + Rb[f])
 *    o[t] := sigmoid(W[o].X[t] + R[o].H[t-1] + Wb[o] + Rb[o])
 *    c[t] :=    tanh(W[c].X[t] + R[c].H[t-1] + Wb[c] + Rb[c])
 * 
 *    C[t] := f[t]*C[t-1] + i[t]*c[t]
 *    H[t] := o[t]*tanh(C[t])
 * 
 *  ::kGRU
 * 
 *    z[t] := sigmoid(W[z].X[t] + R[z].H[t-1] + Wb[z] + Rb[z])
 *    r[t] := sigmoid(W[r].X[t] + R[r].H[t-1] + Wb[r] + Rb[r])
 *    h[t] := tanh(W[h].X[t] + r[t]*(R[h].H[t-1] + Rb[h]) + Wb[h])
 * 
 *    H[t] := (1 - z[t])*h[t] + z[t]*H[t-1]
 *  ~~~
 * 
 *  @see IRNNLayer, IRNNv2Layer
 *  */
@Namespace("nvinfer1") public enum RNNOperation {
    /** Single gate RNN w/ ReLU activation function. */
    kRELU(0),
    /** Single gate RNN w/ TANH activation function. */
    kTANH(1),
    /** Four-gate LSTM network w/o peephole connections. */
    kLSTM(2),
    /** Three-gate network consisting of Gated Recurrent Units. */
    kGRU(3);

    public final int value;
    private RNNOperation(int v) { this.value = v; }
    private RNNOperation(RNNOperation e) { this.value = e.value; }
    public RNNOperation intern() { for (RNNOperation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}



/**
 *  \enum RNNDirection
 * 
 *  \brief Enumerates the RNN direction that may be performed by an RNN layer.
 * 
 *  @see IRNNLayer, IRNNv2Layer
 *  */
@Namespace("nvinfer1") public enum RNNDirection {
    /** Network iterations from first input to last input. */
    kUNIDIRECTION(0),
    /** Network iterates from first to last and vice versa and outputs concatenated. */
    kBIDIRECTION(1);

    public final int value;
    private RNNDirection(int v) { this.value = v; }
    private RNNDirection(RNNDirection e) { this.value = e.value; }
    public RNNDirection intern() { for (RNNDirection e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}



/**
 *  \enum RNNInputMode
 * 
 *  \brief Enumerates the RNN input modes that may occur with an RNN layer.
 * 
 *  If the RNN is configured with RNNInputMode::kLINEAR, then for each gate {@code g} in the first layer of the RNN,
 *  the input vector {@code X[t]} (length {@code E}) is left-multiplied by the gate's corresponding weight matrix {@code W[g]}
 *  (dimensions {@code HxE}) as usual, before being used to compute the gate output as described by \ref RNNOperation.
 * 
 *  If the RNN is configured with RNNInputMode::kSKIP, then this initial matrix multiplication is "skipped"
 *  and {@code W[g]} is conceptually an identity matrix.  In this case, the input vector {@code X[t]} must have length {@code H}
 *  (the size of the hidden state).
 * 
 *  @see IRNNLayer, IRNNv2Layer
 *  */
@Namespace("nvinfer1") public enum RNNInputMode {
    /** Perform the normal matrix multiplication in the first recurrent layer. */
    kLINEAR(0),
    /** No operation is performed on the first recurrent layer. */
    kSKIP(1);

    public final int value;
    private RNNInputMode(int v) { this.value = v; }
    private RNNInputMode(RNNInputMode e) { this.value = e.value; }
    public RNNInputMode intern() { for (RNNInputMode e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IRNNLayer.java



/**
 *  \enum RNNGateType
 * 
 *  \brief Identifies an individual gate within an RNN cell.
 * 
 *  @see RNNOperation
 *  */
@Namespace("nvinfer1") public enum RNNGateType {
    /** Input gate  (i). */
    kINPUT(0),
    /** Output gate (o). */
    kOUTPUT(1),
    /** Forget gate (f). */
    kFORGET(2),
    /** Update gate (z). */
    kUPDATE(3),
    /** Reset gate  (r). */
    kRESET(4),
    /** Cell gate   (c). */
    kCELL(5),
    /** Hidden gate (h). */
    kHIDDEN(6);

    public final int value;
    private RNNGateType(int v) { this.value = v; }
    private RNNGateType(RNNGateType e) { this.value = e.value; }
    public RNNGateType intern() { for (RNNGateType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IRNNv2Layer.java


// Targeting ../nvinfer/IOutputDimensionsFormula.java



/**
 *  \enum PluginFormatType
 * 
 *  \brief Format of the input/output tensors.
 * 
 *  @see IPluginExt::getPluginFormats()
 *  */
@Namespace("nvinfer1") public enum PluginFormat {
    /** NCHW. */
    kNCHW((byte)0),
    /** NCHW with 2-element packed channels. */
    kNC2HW2((byte)1),
    /** NHWC with 8-element packed channels (C must be a multiple of 8). */
    kNHWC8((byte)2);

    public final byte value;
    private PluginFormat(byte v) { this.value = v; }
    private PluginFormat(PluginFormat e) { this.value = e.value; }
    public PluginFormat intern() { for (PluginFormat e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IPlugin.java


// Targeting ../nvinfer/IPluginExt.java


// Targeting ../nvinfer/IPluginLayer.java



/**
 *  \enum FieldType
 *  \brief The possible field types for custom layer.
 *  */

@Namespace("nvinfer1") public enum PluginFieldType {
    /** FP16 field type. */
    kFLOAT16(0),
    /** FP32 field type. */
    kFLOAT32(1),
    /** FP64 field type. */
    kFLOAT64(2),
    /** INT8 field type. */
    kINT8(3),
    /** INT16 field type. */
    kINT16(4),
    /** INT32 field type. */
    kINT32(5),
    /** char field type. */
    kCHAR(6),
    /** nvinfer1::Dims field type. */
    kDIMS(7),
    kUNKNOWN(8);

    public final int value;
    private PluginFieldType(int v) { this.value = v; }
    private PluginFieldType(PluginFieldType e) { this.value = e.value; }
    public PluginFieldType intern() { for (PluginFieldType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}
// Targeting ../nvinfer/PluginField.java


// Targeting ../nvinfer/PluginFieldCollection.java


// Targeting ../nvinfer/IPluginCreator.java


// Targeting ../nvinfer/IPluginRegistry.java



/**
 *  \enum UnaryOperation
 * 
 *  \brief Enumerates the unary operations that may be performed by a Unary layer.
 * 
 *  @see IUnaryLayer
 *  */
@Namespace("nvinfer1") public enum UnaryOperation {
    /** Exponentiation. */
    kEXP(0),
    /** Log (base e). */
    kLOG(1),
    /** Square root. */
    kSQRT(2),
    /** Reciprocal. */
    kRECIP(3),
    /** Absolute value. */
    kABS(4),
    /** Negation. */
    kNEG(5);

    public final int value;
    private UnaryOperation(int v) { this.value = v; }
    private UnaryOperation(UnaryOperation e) { this.value = e.value; }
    public UnaryOperation intern() { for (UnaryOperation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IUnaryLayer.java



/**
 *  \enum ReduceOperation
 * 
 *  \brief Enumerates the reduce operations that may be performed by a Reduce layer.
 *  */
@Namespace("nvinfer1") public enum ReduceOperation {
    kSUM(0),
    kPROD(1),
    kMAX(2),
    kMIN(3),
    kAVG(4);

    public final int value;
    private ReduceOperation(int v) { this.value = v; }
    private ReduceOperation(ReduceOperation e) { this.value = e.value; }
    public ReduceOperation intern() { for (ReduceOperation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IReduceLayer.java


// Targeting ../nvinfer/IPaddingLayer.java


// Targeting ../nvinfer/Permutation.java


// Targeting ../nvinfer/IShuffleLayer.java



/**
 *  \enum TopKOperation
 * 
 *  \brief Enumerates the operations that may be performed by a TopK layer.
 *  */
@Namespace("nvinfer1") public enum TopKOperation {
    /** Maximum of the elements. */
    kMAX(0),
    /** Minimum of the elements. */
    kMIN(1);

    public final int value;
    private TopKOperation(int v) { this.value = v; }
    private TopKOperation(TopKOperation e) { this.value = e.value; }
    public TopKOperation intern() { for (TopKOperation e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/ITopKLayer.java


// Targeting ../nvinfer/IMatrixMultiplyLayer.java


// Targeting ../nvinfer/IRaggedSoftMaxLayer.java


// Targeting ../nvinfer/IIdentityLayer.java


// Targeting ../nvinfer/IConstantLayer.java


// Targeting ../nvinfer/INetworkDefinition.java


// Targeting ../nvinfer/IProfiler.java


// Targeting ../nvinfer/IExecutionContext.java


// Targeting ../nvinfer/ICudaEngine.java



/**
 *  enum CalibrationAlgoType
 * 
 *  \brief Version of calibration algorithm to use.
 *  */
@Namespace("nvinfer1") public enum CalibrationAlgoType {
    kLEGACY_CALIBRATION(0),
    kENTROPY_CALIBRATION(1);

    public final int value;
    private CalibrationAlgoType(int v) { this.value = v; }
    private CalibrationAlgoType(CalibrationAlgoType e) { this.value = e.value; }
    public CalibrationAlgoType intern() { for (CalibrationAlgoType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}


// Targeting ../nvinfer/IInt8Calibrator.java


// Targeting ../nvinfer/IInt8EntropyCalibrator.java


// Targeting ../nvinfer/IInt8LegacyCalibrator.java


// Targeting ../nvinfer/IGpuAllocator.java


// Targeting ../nvinfer/IBuilder.java


// Targeting ../nvinfer/IPluginFactory.java


// Targeting ../nvinfer/IRuntime.java


// Targeting ../nvinfer/ILogger.java





 // namespace nvinfer1

/** Internal C entry point for creating IBuilder. */
public static native Pointer createInferBuilder_INTERNAL(Pointer logger, int version);
/** Internal C entry point for creating IRuntime.
<p>
//!
//! */
public static native Pointer createInferRuntime_INTERNAL(Pointer logger, int version);

/**
 *  \brief Return the logger object.
 *  */


//!
//!
//!
public static native ILogger getLogger();

/**
 *  \brief Return the library version number.
 * 
 *  The format is as for TENSORRT_VERSION: (TENSORRT_MAJOR * 1000) + (TENSORRT_MINOR * 100) + TENSOR_PATCH.
 *  */


//!
//!
public static native int getInferLibVersion();

/**
 *  \brief Return the plugin registry
 *  */
public static native IPluginRegistry getPluginRegistry();
/**
 *  \brief Create an instance of an IBuilder class.
 * 
 *  This class is the logging class for the builder.
 *  */


//!
//!
//!
@Namespace("nvinfer1") public static native IBuilder createInferBuilder(@ByRef ILogger logger);

/**
 *  \brief Create an instance of an IRuntime class.
 * 
 *  This class is the logging class for the runtime.
 *  */
@Namespace("nvinfer1") public static native IRuntime createInferRuntime(@ByRef ILogger logger);


/**
 *  \brief Register the plugin creator to the registry
 *  The static registry object will be instantiated when the plugin library is
 *  loaded. This static object will register all creators available in the
 *  library to the registry.
 *  */

// #define REGISTER_TENSORRT_PLUGIN(name) static PluginRegistrar<name> pluginRegistrar##name{}



// #endif


// Parsed from NvUtils.h

/*
 * Copyright 1993-2018 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #ifndef NV_UTILS_H
// #define NV_UTILS_H

// #include "NvInfer.h"

    /**
     *  @param input The input weights to reshape.
     *  @param shape The shape of the weights.
     *  @param shapeOrder The order of the dimensions to process for the output.
     *  @param data The location where the output data is placed.
     *  @param nbDims The number of dimensions to process.
     * 
     *  \brief Reformat the input weights of the given shape based on the new
     *  order of dimensions.
     * 
     *  Take the weights specified by \p input with the dimensions specified by
     *  \p shape and re-order the weights based on the new dimensions specified
     *  by \p shapeOrder. The size of each dimension and the input data is not
     *  modified. The output volume pointed to by \p data must be the same as
     *  he \p input volume.
     * 
     *  Example usage:
     *  float *out = new float[N*C*H*W];
     *  Weights input{DataType::kFLOAT, {0 ... N*C*H*W-1}, N*C*H*W size};
     *  int order[4]{1, 0, 3, 2};
     *  int shape[4]{C, N, W, H};
     *  reshapeWeights(input, shape, order, out, 4);
     *  Weights reshaped{input.type, out, input.count};
     * 
     *  Input Matrix{3, 2, 3, 2}:
     *  { 0  1}, { 2  3}, { 4  5} <-- {0, 0, *, *}
     *  { 6  7}, { 8  9}, {10 11} <-- {0, 1, *, *}
     *  {12 13}, {14 15}, {16 17} <-- {1, 0, *, *}
     *  {18 19}, {20 21}, {22 23} <-- {1, 1, *, *}
     *  {24 25}, {26 27}, {28 29} <-- {2, 0, *, *}
     *  {30 31}, {32 33}, {34 35} <-- {2, 1, *, *}
     * 
     *  Output Matrix{2, 3, 2, 3}:
     *  { 0  2  4}, { 1  3  5} <-- {0, 0, *, *}
     *  {12 14 16}, {13 15 17} <-- {0, 1, *, *}
     *  {24 26 28}, {25 27 29} <-- {0, 2, *, *}
     *  { 6  8 10}, { 7  9 11} <-- {1, 0, *, *}
     *  {18 20 22}, {19 21 23} <-- {1, 1, *, *}
     *  {30 32 34}, {31 33 35} <-- {1, 2, *, *}
     * 
     *  @return True on success, false on failure.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reshapeWeights(@Const @ByRef Weights input, @Const IntPointer shape, @Const IntPointer shapeOrder, Pointer data, int nbDims);
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reshapeWeights(@Const @ByRef Weights input, @Const IntBuffer shape, @Const IntBuffer shapeOrder, Pointer data, int nbDims);
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reshapeWeights(@Const @ByRef Weights input, @Const int[] shape, @Const int[] shapeOrder, Pointer data, int nbDims);

    /**
     *  @param input The input data to re-order.
     *  @param order The new order of the data sub-buffers.
     *  @param num The number of data sub-buffers to re-order.
     *  @param size The size of each data sub-buffer in bytes.
     * 
     *  \brief Takes an input stream and re-orders \p num chunks of the data
     *  given the \p size and \p order.
     * 
     *  In some frameworks, the ordering of the sub-buffers within a dimension
     *  is different than the way that TensorRT expects them.
     *  TensorRT expects the gate/bias sub-buffers for LSTM's to be in fico order.
     *  TensorFlow however formats the sub-buffers in icfo order.
     *  This helper function solves this in a generic fashion.
     * 
     *  Example usage output of reshapeWeights above:
     *  int indir[1]{1, 0}
     *  int stride = W*H;
     *  for (int x = 0, y = N*C; x < y; ++x)
     *  reorderSubBuffers(out + x * stride, indir, H, W);
     * 
     *  Input Matrix{2, 3, 2, 3}:
     *  { 0  2  4}, { 1  3  5} <-- {0, 0, *, *}
     *  {12 14 16}, {13 15 17} <-- {0, 1, *, *}
     *  {24 26 28}, {25 27 29} <-- {0, 2, *, *}
     *  { 6  8 10}, { 7  9 11} <-- {1, 0, *, *}
     *  {18 20 22}, {19 21 23} <-- {1, 1, *, *}
     *  {30 32 34}, {31 33 35} <-- {1, 2, *, *}
     * 
     *  Output Matrix{2, 3, 2, 3}:
     *  { 1  3  5}, { 0  2  4} <-- {0, 0, *, *}
     *  {13 15 17}, {12 14 16} <-- {0, 1, *, *}
     *  {25 27 29}, {24 26 28} <-- {0, 2, *, *}
     *  { 7  9 11}, { 6  8 10} <-- {1, 0, *, *}
     *  {19 21 23}, {18 20 22} <-- {1, 1, *, *}
     *  {31 33 35}, {30 32 34} <-- {1, 2, *, *}
     * 
     *  @return True on success, false on failure.
     * 
     *  @see reshapeWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reorderSubBuffers(Pointer input, @Const IntPointer order, int num, int size);
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reorderSubBuffers(Pointer input, @Const IntBuffer order, int num, int size);
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean reorderSubBuffers(Pointer input, @Const int[] order, int num, int size);

    /**
     *  @param input The input data to transpose.
     *  @param type The type of the data to transpose.
     *  @param num The number of data sub-buffers to transpose.
     *  @param height The size of the height dimension to transpose.
     *  @param width The size of the width dimension to transpose.
     * 
     *  \brief Transpose \p num sub-buffers of \p height * \p width.
     * 
     *  @return True on success, false on failure.
     *  */
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean transposeSubBuffers(Pointer input, DataType type, int num, int height, int width);
    @Namespace("nvinfer1::utils") public static native @Cast("bool") boolean transposeSubBuffers(Pointer input, @Cast("nvinfer1::DataType") int type, int num, int height, int width);

 // utils namespace
 // nvinfer1 namespace
// #endif // NV_UTILS_H


}
