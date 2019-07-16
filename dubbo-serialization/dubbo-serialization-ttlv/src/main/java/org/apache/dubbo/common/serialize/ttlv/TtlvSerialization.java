package org.apache.dubbo.common.serialize.ttlv;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.serialize.ObjectInput;
import org.apache.dubbo.common.serialize.ObjectOutput;
import org.apache.dubbo.common.serialize.Serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static org.apache.dubbo.common.serialize.Constants.TTLV_SERIALIZATION_ID;

public class TtlvSerialization implements Serialization {

    @Override
    public byte getContentTypeId() {
        return TTLV_SERIALIZATION_ID;
    }

    @Override
    public String getContentType() {
        return "x-application/ttlv";
    }

    @Override
    public ObjectOutput serialize(URL url, OutputStream output) throws IOException {
        return new TtlvObjectOutput(output);
    }

    @Override
    public ObjectInput deserialize(URL url, InputStream input) throws IOException {
        return null;
    }
}
