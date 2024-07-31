package com.assignment13.code4;

public class TextDocument extends Document{
    TextDocument(String docName,int size){
        super(docName,size);
    }

    @Override
    String getDocumentType() {
        return "Text";
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("Document Type:"+this.getDocumentType());
    }
}
