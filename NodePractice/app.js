/**
 * Module dependencies.
 */

var http = require('http');

var server = http.createServer(function(req, res) {
	res.writeHead(200);
	res.end('<h4>Learning Node.js http module!</h4>');
});

server.listen(8080);