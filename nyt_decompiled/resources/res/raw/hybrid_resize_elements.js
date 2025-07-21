(function() {
    var param = %1$s;
    resizeNativeAdElements(param);
    var jsonArray = JSON.stringify(param).split('\"');
    var adId = jsonArray[1];
    return adId;
})();
