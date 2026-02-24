int n = s.nextInt();s.nextLine();
      if(n < 26){
        System.out.print("NO");
        return;
      }
      String str = s.nextLine();
      int flag = 0;
      for(int i = 0;i<n;i++){
        char c = Character.toLowerCase(str.charAt(i));
        flag = flag | (1 << (c-'a'));
      }
      if(flag == ((1 << 26)-1)){
        System.out.print("YES");
        return;
      }
      System.out.print("NO");