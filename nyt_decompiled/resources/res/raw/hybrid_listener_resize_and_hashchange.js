(function() {
    window.addEventListener('message', function(event){
            if (event.data.type == 'resize'){
              %1$s.onResize();
            }
          });

    window.addEventListener(
      "hashchange",
      (event) => {
        %1$s.onHashChange(event.newURL);
        history.replaceState(null, null, window.location.pathname + window.location.search);
      },
      false,
    );
})();
