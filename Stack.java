bplist00�_WebMainResource�	
^WebResourceURL_WebResourceFrameName_WebResourceData_WebResourceMIMEType_WebResourceTextEncodingName_�https://instructure-uploads.s3.amazonaws.com/account_111400000000000001/attachments/10526/Stack.java?response-content-disposition=inline%3B%20filename%3D%22Stack.java%22%3B%20filename%2A%3DUTF-8%27%27Stack.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20210202%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20210202T140858Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=e58029ccdb4914521d00862081a2bd4e6a5fec92f7b7c554b84adeabd6d5fe71PO�<html><head></head><body><pre style="word-wrap: break-word; white-space: pre-wrap;">public interface Stack&lt;E&gt; 
{

   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack

}</pre></body></html>[text/x-javaUUTF-8    ( 7 N ` v �vw                           #