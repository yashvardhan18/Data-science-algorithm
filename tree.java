public class tree {
    class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

   public class my_bst {
        node root;

        public my_bst() {
            root = null;
        }

        public void insert(int data) {
            node new_node = new node(data);
            if (root == null) {
                root = new_node;
            } else {
                node current = root;
                node present = null;
                while (true) {
                    present = current;
                    if (data < current.data) {
                        current = current.left;
                        if (current == null) {
                            present.left = new_node;
                            return;
                        }
                    } else {
                        current = current.right;
                        if (current == null) {
                            present.right = new_node;
                            return;
                        }
                    }

                }


            }
        }
         void search(node root,int data){
            node current=root;
            while(current.data!=data){
                if(data<current.data)
                    current=current.left;
                else
                    current=current.right;
                if(current==null)
                    System.out.println("not found!");

            }
             System.out.println("Found!");
        }
       void print(node root)
       {
           if (root == null){
               return;
           }
           else {
               print(root.left);
               System.out.print(root.data + " ");
               print(root.right);
           }
           }


   }
    class main {
        public void main(String[] args) {
            my_bst obj=new my_bst();
            obj.insert(40);
            obj.insert(50);
            obj.insert(60);
            obj.insert(70);
            obj.insert(80);
            obj.search();
            obj.print();



        }
    }

    }

