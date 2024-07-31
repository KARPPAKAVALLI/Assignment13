package com.assignment13.code4;

public class ImageDocument extends Document{
    ImageDocument(String docName,int size){
        super(docName,size);
    }

    @Override
    String getDocumentType() {
        return "Image";
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Document Type:"+this.getDocumentType());
    }
}
